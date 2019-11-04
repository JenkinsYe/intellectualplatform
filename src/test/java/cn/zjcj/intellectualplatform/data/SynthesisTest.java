package cn.zjcj.intellectualplatform.data;

import cn.zjcj.intellectualplatform.domain.SynthesisDomain;
import cn.zjcj.intellectualplatform.service.SynthesisDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 综合信息测试类
 * @author YJJ
 * @Date: Created in 21:02 2019-11-02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SynthesisTest {

    @Autowired
    public SynthesisDataService synthesisDataService;

    @Test
    public void findByNameTest() {
        List<SynthesisDomain> result = synthesisDataService.findByName("北京市");
        for (SynthesisDomain domain : result) {
            System.out.println(domain);
        }
    }

    @Test
    public void findAllTest() {
        System.out.println(synthesisDataService);
        List<SynthesisDomain> result = synthesisDataService.findAll();
        for (SynthesisDomain domain : result) {
            System.out.println(domain);
        }
    }
}
