package cn.zjcj.intellectualplatform.controller;

import cn.zjcj.intellectualplatform.domain.LandDomain;
import cn.zjcj.intellectualplatform.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author YJJ
 * @Date: Created in 15:53 2019-11-09
 */
@RestController
public class LandController {

    @Autowired
    private DataService dataService;

    @GetMapping("/land/findByName")
    public List<LandDomain> findLandByName(@RequestParam("name") String name) {
        return dataService.findLandByName(name);
    }

    @GetMapping("/land/findByYear")
    public List<LandDomain> findLandByYear(@RequestParam("year") Integer year) {
        return dataService.findLandByYear(year);
    }
}
