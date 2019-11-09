package cn.zjcj.intellectualplatform.controller;

import cn.zjcj.intellectualplatform.domain.EnergyDomain;
import cn.zjcj.intellectualplatform.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 能源保障查询接口
 * @author YJJ
 * @Date: Created in 15:20 2019-11-09
 */
@RestController
public class EnergyController {

    @Autowired
    private DataService dataService;

    @GetMapping("/energy/findByName")
    public List<EnergyDomain> findEnergyByName(@RequestParam("name") String name) {
        return dataService.findEnergyByName(name);
    }

    @GetMapping("/energy/findByYear")
    public List<EnergyDomain> findEnergyByYear(@RequestParam("year") Integer year) {
        return dataService.findEnergyByYear(year);
    }
}
