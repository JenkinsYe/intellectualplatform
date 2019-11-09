package cn.zjcj.intellectualplatform.service;

import cn.zjcj.intellectualplatform.dao.*;
import cn.zjcj.intellectualplatform.domain.*;
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
    private TalentDao talentDao;
    private EnergyDao energyDao;
    private EnvironmentDao environmentDao;
    private LandDao landDao;
    private TrafficDao trafficDao;
    private WaterDao waterDao;

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
        talentDao = sqlSession.getMapper(TalentDao.class);
        energyDao = sqlSession.getMapper(EnergyDao.class);
        environmentDao = sqlSession.getMapper(EnvironmentDao.class);
        landDao = sqlSession.getMapper(LandDao.class);
        trafficDao = sqlSession.getMapper(TrafficDao.class);
        waterDao = sqlSession.getMapper(WaterDao.class);
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

    @Override
    public List<TalentDomain> findTalentByName(String name) {
        return talentDao.findByName(name);
    }

    @Override
    public List<TalentDomain> findTalentByYear(Integer year) {
        if (ParamCheckUtils.isValidYear(year))
            return talentDao.findByYear(year);
        return null;
    }

    @Override
    public List<EnergyDomain> findEnergyByName(String name) {
        return energyDao.findByName(name);
    }

    @Override
    public List<EnergyDomain> findEnergyByYear(Integer year) {
        if (ParamCheckUtils.isValidYear(year))
            return energyDao.findByYear(year);
        return null;
    }

    @Override
    public List<EnvironmentDomain> findEnvironmentByName(String name) {
        return environmentDao.findByName(name);
    }

    @Override
    public List<EnvironmentDomain> findEnvironmentByYear(Integer year) {
        if (ParamCheckUtils.isValidYear(year))
            return environmentDao.findByYear(year);
        return null;
    }

    @Override
    public List<LandDomain> findLandByName(String name) {
        return landDao.findByName(name);
    }

    @Override
    public List<LandDomain> findLandByYear(Integer year) {
        if (ParamCheckUtils.isValidYear(year))
            return landDao.findByYear(year);
        return null;
    }

    @Override
    public List<TrafficDomain> findTrafficByName(String name) {
        return trafficDao.findByName(name);
    }

    @Override
    public List<TrafficDomain> findTrafficByYear(Integer year) {
        if (ParamCheckUtils.isValidYear(year))
            return trafficDao.findByYear(year);
        return null;
    }

    @Override
    public List<WaterDomain> findWaterByName(String name) {
        return waterDao.findByName(name);
    }

    @Override
    public List<WaterDomain> findWaterByYear(Integer year) {
        if (ParamCheckUtils.isValidYear(year))
            return waterDao.findByYear(year);
        return null;
    }
}
