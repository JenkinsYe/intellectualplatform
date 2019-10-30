package cn.zjcj.intellectualplatform;

import cn.zjcj.intellectualplatform.dao.SynthesisDao;
import cn.zjcj.intellectualplatform.domain.SynthesisDomain;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 15:43 2019-10-30
 */
public class MybatisTest {

    private InputStream in;
    private SqlSession sqlSession;
    private SynthesisDao synthesisDao;


    public void init() throws Exception {
        in = Resources.getResourceAsStream("sqlmap/nation_sqlmapconfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession();
        synthesisDao = sqlSession.getMapper(SynthesisDao.class);
    }


    public void destory() throws Exception {
        sqlSession.close();
        in.close();
    }

    @Test
    public void testFindAll() throws Exception {
        List<SynthesisDomain> synthesisDomains = synthesisDao.findAll();
        for (SynthesisDomain domain : synthesisDomains) {
            System.out.println(domain);
        }
    }

    @Test
    public  void testSaveSynthesis() throws Exception {
        init();
        SynthesisDomain domain = new SynthesisDomain();
        domain.setName("北京市");
        domain.setYear(2017);
        domain.setTotalGDP(28014.94);
        domain.setPrimaryIndustryGDP(120.42);
        domain.setSecondaryIndustryGDP(5326.76);
        domain.setTertiaryIndustryGDP(22567.76);
        domain.setIndustryIncrement(4274d);
        domain.setPerCapitaGDP(128994d);
        domain.setGDPIndex(106.7);
        domain.setPrimaryIndustryGDPIndex(94.1);
        domain.setSecondaryIndustryGDPIndex(104.7);
        domain.setTertiaryIndustryGDPIndex(107.3);
        synthesisDao.saveSynthesisDomain(domain);
        destory();
    }
}
