package cn.zjcj.intellectualplatform.controller;

import cn.zjcj.intellectualplatform.domain.WaterDomain;
import cn.zjcj.intellectualplatform.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 16:30 2019-11-09
 */
@RestController
public class WaterController {

    @Autowired
    private DataService dataService;

    @GetMapping("/water/findWaterByName")
    public List<WaterDomain> findWaterByName(@RequestParam("name") String name) {
        return dataService.findWaterByName(name);
    }

    @GetMapping("/water/findWaterByYear")
    public List<WaterDomain> findWaterByYear(@RequestParam("year") Integer year) {
        return dataService.findWaterByYear(year);
    }
}
