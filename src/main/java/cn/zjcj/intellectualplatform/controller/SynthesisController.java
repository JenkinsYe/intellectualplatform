package cn.zjcj.intellectualplatform.controller;

import cn.zjcj.intellectualplatform.domain.SynthesisDomain;
import cn.zjcj.intellectualplatform.service.SynthesisDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 综合信息查询接口
 * @author YJJ
 * @Date: Created in 15:06 2019-11-02
 */
@RestController
public class SynthesisController {

    @Autowired
    private SynthesisDataService synthesisDataService;

    @GetMapping("/synthesis/findByName")
    public List<SynthesisDomain> findSynthesisByName(@RequestParam("name") String name) {
        return synthesisDataService.findByName(name);
    }
}
