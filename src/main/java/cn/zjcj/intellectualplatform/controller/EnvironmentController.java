package cn.zjcj.intellectualplatform.controller;

import cn.zjcj.intellectualplatform.domain.EnvironmentDomain;
import cn.zjcj.intellectualplatform.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 15:31 2019-11-09
 */
@RestController
public class EnvironmentController {

    @Autowired
    private DataService dataService;

    @GetMapping("/environment/findByName")
    public List<EnvironmentDomain> findEnvironmentByName(@RequestParam("name") String name) {
        return dataService.findEnvironmentByName(name);
    }

    @GetMapping("/environment/findByYear")
    public List<EnvironmentDomain> findEnvironmentByYear(@RequestParam("year") Integer year) {
        return dataService.findEnvironmentByYear(year);
    }
}
