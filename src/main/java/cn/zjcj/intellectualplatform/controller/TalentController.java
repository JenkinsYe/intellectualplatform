package cn.zjcj.intellectualplatform.controller;

import cn.zjcj.intellectualplatform.domain.InvestmentDomain;
import cn.zjcj.intellectualplatform.domain.TalentDomain;
import cn.zjcj.intellectualplatform.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 17:32 2019-11-07
 */
@RestController
public class TalentController {

    @Autowired
    private DataService dataService;

    @GetMapping("/talent/findByName")
    public List<TalentDomain> findTalentByName(@RequestParam("name") String name) {
        return dataService.findTalentByName(name);
    }

    @GetMapping("/talent/findByYear")
    public List<TalentDomain> findInvestmentByYear(@RequestParam("year") Integer year) {
        return dataService.findTalentByYear(year);
    }
}
