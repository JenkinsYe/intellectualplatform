package cn.zjcj.intellectualplatform.dal;

import cn.zjcj.intellectualplatform.domain.InvestmentDomain;
import cn.zjcj.intellectualplatform.domain.RevenueDomain;
import cn.zjcj.intellectualplatform.domain.SynthesisDomain;
import cn.zjcj.intellectualplatform.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 综合信息测试类
 * @author YJJ
 * @Date: Created in 21:02 2019-11-02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SynthesisTest {

    @Autowired
    public DataService dataService;

    @Test
    public void findSynthesisByNameTest() {
        List<SynthesisDomain> result = dataService.findSynthesisByName("北京市");
        for (SynthesisDomain domain : result) {
            log.info(domain.toString());
        }
    }

    @Test
    public void findSynthesisByYearTest() {
        List<SynthesisDomain> result = dataService.findSynthesisByYear(2017);
        for (SynthesisDomain domain : result) {
            log.info(domain.toString());
        }
    }

    @Test
    public void findInvestmentByNameTest() {
        List<InvestmentDomain> result = dataService.findInvestmentByName("北京市");
        for (InvestmentDomain domain : result) {
            log.info(domain.toString());
        }
    }

    @Test
    public void findInvestmentByYearTest() {
        List<InvestmentDomain> result = dataService.findInvestmentByYear(2017);
        for (InvestmentDomain domain : result) {
            log.info(domain.toString());
        }
    }

    @Test
    public void findRevenueByNameTest() {
        List<RevenueDomain> result = dataService.findRevenueByName("北京市");
        for (RevenueDomain domain : result) {
            log.info(domain.toString());
        }
    }

    @Test
    public void findRevenueByYearTest() {
        List<RevenueDomain> result = dataService.findRevenueByYear(2017);
        for (RevenueDomain domain : result) {
            log.info(domain.toString());
        }
    }
}
