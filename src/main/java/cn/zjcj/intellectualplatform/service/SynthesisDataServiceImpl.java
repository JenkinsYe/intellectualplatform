package cn.zjcj.intellectualplatform.service;

import cn.zjcj.intellectualplatform.dao.SynthesisDao;
import cn.zjcj.intellectualplatform.domain.SynthesisDomain;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 20:45 2019-11-02
 */
@Service
public class SynthesisDataServiceImpl implements SynthesisDataService {

    private InputStream in;
    private SqlSession sqlSession;
    private SynthesisDao synthesisDao;

    @PostConstruct
    public void init() {
        try {
            in = Resources.getResourceAsStream("sqlmap/nation_sqlmapconfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession();
        synthesisDao = sqlSession.getMapper(SynthesisDao.class);
    }

    @Override
    public List<SynthesisDomain> findByName(String name) {
        return synthesisDao.findByName(name);
    }

    @Override
    public List<SynthesisDomain> findAll() {
        return synthesisDao.findAll();
    }
}
