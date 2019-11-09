package cn.zjcj.intellectualplatform.controller;


import cn.zjcj.intellectualplatform.domain.InvestmentDomain;
import cn.zjcj.intellectualplatform.domain.RevenueDomain;
import cn.zjcj.intellectualplatform.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 财政税收查询接口
 * @author YJJ
 * @Date: Created in 17:24 2019-11-07
 */
@RestController
public class RevenueController {

    @Autowired
    private DataService dataService;

    @GetMapping("/revenue/findByName")
    public List<RevenueDomain> findRevenueByName(@RequestParam("name") String name) {
        return dataService.findRevenueByName(name);
    }

    @GetMapping("/revenue/findByYear")
    public List<RevenueDomain> findRevenueByYear(@RequestParam("year") Integer year) {
        return dataService.findRevenueByYear(year);
    }
}
