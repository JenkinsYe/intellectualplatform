package cn.zjcj.intellectualplatform.data;

import cn.zjcj.intellectualplatform.domain.SynthesisDomain;
import cn.zjcj.intellectualplatform.service.SynthesisDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 综合信息测试类
 * @author YJJ
 * @Date: Created in 21:02 2019-11-02
 */
public class SynthesisTest {

    @Autowired
    private SynthesisDataService synthesisDataService;

    @Test
    public void findByNameTest() {
        List<SynthesisDomain> result = synthesisDataService.findByName("北京人");
        for (SynthesisDomain domain : result) {
            System.out.println(domain);
        }
    }

    @Test
    public void findAllTest() {
        List<SynthesisDomain> result = synthesisDataService.findAll();
        for (SynthesisDomain domain : result) {
            System.out.println(domain);
        }
    }
}
