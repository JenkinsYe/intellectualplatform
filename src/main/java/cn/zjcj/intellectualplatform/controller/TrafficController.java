package cn.zjcj.intellectualplatform.controller;

import cn.zjcj.intellectualplatform.domain.TrafficDomain;
import cn.zjcj.intellectualplatform.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 16:17 2019-11-09
 */
@RestController
public class TrafficController {

    @Autowired
    private DataService dataService;

    @GetMapping("/traffic/findByName")
    public List<TrafficDomain> findTrafficByName(@RequestParam("name") String name) {
        return dataService.findTrafficByName(name);
    }

    @GetMapping("/traffic/findByYear")
    public List<TrafficDomain> findTrafficByYear(@RequestParam("year") Integer year) {
        return dataService.findTrafficByYear(year);
    }
}
