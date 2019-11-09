package cn.zjcj.intellectualplatform.dal;

import cn.zjcj.intellectualplatform.domain.*;
import cn.zjcj.intellectualplatform.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 数据层测试类
 * @author YJJ
 * @Date: Created in 21:02 2019-11-02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DataTest {

    @Autowired
    public DataService dataService;

    @Test
    public void findSynthesisByNameTest() {
        List<SynthesisDomain> result = dataService.findSynthesisByName("北京市");
        Assert.assertNotNull(result);
        for (SynthesisDomain domain : result) {
            Assert.assertTrue(domain.getName().equals("北京市"));
            log.info(domain.toString());
        }
    }

    @Test
    public void findSynthesisByYearTest() {
        List<SynthesisDomain> result = dataService.findSynthesisByYear(2017);
        Assert.assertNotNull(result);
        for (SynthesisDomain domain : result) {
            Assert.assertTrue(domain.getYear() == 2017);
            log.info(domain.toString());
        }
    }

    @Test
    public void findInvestmentByNameTest() {
        List<InvestmentDomain> result = dataService.findInvestmentByName("北京市");
        Assert.assertNotNull(result);
        for (InvestmentDomain domain : result) {
            Assert.assertTrue(domain.getName().equals("北京市"));
            log.info(domain.toString());
        }
    }

    @Test
    public void findInvestmentByYearTest() {
        List<InvestmentDomain> result = dataService.findInvestmentByYear(2017);
        Assert.assertNotNull(result);
        for (InvestmentDomain domain : result) {
            Assert.assertTrue(domain.getYear() == 2017);
            log.info(domain.toString());
        }
    }

    @Test
    public void findRevenueByNameTest() {
        List<RevenueDomain> result = dataService.findRevenueByName("北京市");
        Assert.assertNotNull(result);
        for (RevenueDomain domain : result) {
            Assert.assertTrue(domain.getName().equals("北京市"));
            log.info(domain.toString());
        }
    }

    @Test
    public void findRevenueByYearTest() {
        List<RevenueDomain> result = dataService.findRevenueByYear(2017);
        Assert.assertNotNull(result);
        for (RevenueDomain domain : result) {
            Assert.assertTrue(domain.getYear() == 2017);
            log.info(domain.toString());
        }
    }

    @Test
    public void findTalentByNameTest() {
        List<TalentDomain> result = dataService.findTalentByName("浙江省");
        Assert.assertNotNull(result);
        for (TalentDomain domain : result) {
            Assert.assertTrue(domain.getName().equals("浙江省"));
            log.info(domain.toString());
        }
    }

    @Test
    public void findTalentByYearTest() {
        List<TalentDomain> result = dataService.findTalentByYear(2016);
        Assert.assertNotNull(result);
        for (TalentDomain domain : result) {
            Assert.assertTrue(domain.getYear() == 2016);
            log.info(domain.toString());
        }
    }

    @Test
    public void findEnergyByNameTest() {
        List<EnergyDomain> result = dataService.findEnergyByName("浙江省");
        Assert.assertNotNull(result);
        for (EnergyDomain domain : result) {
            Assert.assertTrue(domain.getName().equals("浙江省"));
            log.info(domain.toString());
        }
    }

    @Test
    public void findEnergyByYearTest() {
        List<EnergyDomain> result = dataService.findEnergyByYear(2013);
        Assert.assertNotNull(result);
        for (EnergyDomain domain : result) {
            Assert.assertTrue(domain.getYear() == 2013);
            log.info(domain.toString());
        }
    }

    @Test
    public void findEnvironmentByNameTest() {
        List<EnvironmentDomain> result = dataService.findEnvironmentByName("浙江省");
        Assert.assertNotNull(result);
        for (EnvironmentDomain domain : result) {
            Assert.assertTrue(domain.getName().equals("浙江省"));
            log.info(domain.toString());
        }
    }

    @Test
    public void findEnvironmentByYearTest() {
        List<EnvironmentDomain> result = dataService.findEnvironmentByYear(2015);
        Assert.assertNotNull(result);
        for (EnvironmentDomain domain : result) {
            Assert.assertTrue(domain.getYear() == 2015);
            log.info(domain.toString());
        }
    }

    @Test
    public void findLandByNameTest() {
        List<LandDomain> result = dataService.findLandByName("湖南省");
        Assert.assertNotNull(result);
        for (LandDomain domain : result) {
            Assert.assertTrue(domain.getName().equals("湖南省"));
            log.info(domain.toString());
        }
    }

    @Test
    public void findLandByYearTest(){
        List<LandDomain> result = dataService.findLandByYear(2017);
        Assert.assertNotNull(result);
        for (LandDomain domain : result) {
            Assert.assertTrue(domain.getYear() == 2017);
            log.info(domain.toString());
        }
    }

    @Test
    public void findTrafficByNameTest() {
        List<TrafficDomain> result = dataService.findTrafficByName("浙江省");
        Assert.assertNotNull(result);
        for (TrafficDomain domain : result) {
            Assert.assertTrue(domain.getName().equals("浙江省"));
            log.info(domain.toString());
        }
    }

    @Test
    public void findTrafficByYearTest() {
        List<TrafficDomain> result = dataService.findTrafficByYear(2016);
        Assert.assertNotNull(result);
        for (TrafficDomain domain : result) {
            Assert.assertTrue(domain.getYear() == 2016);
            log.info(domain.toString());
        }
    }

    @Test
    public void findWaterByNameTest() {
        List<WaterDomain> result = dataService.findWaterByName("广东省");
        Assert.assertNotNull(result);
        for (WaterDomain domain : result) {
            Assert.assertTrue(domain.getName().equals("广东省"));
            log.info(domain.toString());
        }
    }

    @Test
    public void findWaterByYearTest() {
        List<WaterDomain> result = dataService.findWaterByYear(2014);
        Assert.assertNotNull(result);
        for (WaterDomain domain : result) {
            Assert.assertTrue(domain.getYear() == 2014);
            log.info(domain.toString());
        }
    }
}
