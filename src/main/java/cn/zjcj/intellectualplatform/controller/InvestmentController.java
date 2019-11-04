package cn.zjcj.intellectualplatform.controller;

import cn.zjcj.intellectualplatform.domain.InvestmentDomain;
import cn.zjcj.intellectualplatform.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 投资类信息查询接口
 * @author YJJ
 * @Date: Created in 15:43 2019-11-04
 */
@RestController
public class InvestmentController {
    @Autowired
    private DataService dataService;

    @GetMapping("/investment/findByName")
    public List<InvestmentDomain> findInvestmentByName(@RequestParam("name") String name) {
        return dataService.findInvestmentByName(name);
    }

    @GetMapping("/investment/findByYear")
    public List<InvestmentDomain> findInvestmentByYear(@RequestParam("year") Integer year) {
        return dataService.findInvestmentByYear(year);
    }
}
