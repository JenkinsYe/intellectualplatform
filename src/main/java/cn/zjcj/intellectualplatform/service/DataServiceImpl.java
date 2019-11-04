package cn.zjcj.intellectualplatform.service;

import cn.zjcj.intellectualplatform.dao.InvestmentDao;
import cn.zjcj.intellectualplatform.dao.RevenueDao;
import cn.zjcj.intellectualplatform.dao.SynthesisDao;
import cn.zjcj.intellectualplatform.domain.InvestmentDomain;
import cn.zjcj.intellectualplatform.domain.RevenueDomain;
import cn.zjcj.intellectualplatform.domain.SynthesisDomain;
import cn.zjcj.intellectualplatform.util.ParamCheckUtils;
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
public class DataServiceImpl implements DataService {

    private InputStream in;
    private SqlSession sqlSession;
    private SynthesisDao synthesisDao;
    private InvestmentDao investmentDao;
    private RevenueDao revenueDao;

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
        investmentDao = sqlSession.getMapper(InvestmentDao.class);
        revenueDao = sqlSession.getMapper(RevenueDao.class);
    }

    @Override
    public List<SynthesisDomain> findSynthesisByName(String name) {
        return synthesisDao.findByName(name);
    }

    @Override
    public List<SynthesisDomain> findSynthesisByYear(Integer year) {
        if (ParamCheckUtils.isValidYear(year))
            return synthesisDao.findByYear(year);
        return null;
    }

    @Override
    public List<InvestmentDomain> findInvestmentByName(String name) {
        return investmentDao.findByName(name);
    }

    @Override
    public List<InvestmentDomain> findInvestmentByYear(Integer year) {
        if (ParamCheckUtils.isValidYear(year))
            return investmentDao.findByYear(year);
        return null;
    }

    @Override
    public List<RevenueDomain> findRevenueByName(String name) {
        return revenueDao.findByName(name);
    }

    @Override
    public List<RevenueDomain> findRevenueByYear(Integer year) {
        if (ParamCheckUtils.isValidYear(year))
            return revenueDao.findByYear(year);
        return null;
    }
}
