package cn.zjcj.intellectualplatform.service;

import cn.zjcj.intellectualplatform.domain.SynthesisDomain;

import java.util.List;

/**
 * 综合信息数据服务接口
 * @author YJJ
 * @Date: Created in 20:43 2019-11-02
 */
public interface SynthesisDataService {

    /**
     * 根据地区名字查询
     * @param name
     * @return
     */
    List<SynthesisDomain> findByName(String name);

    /**
     * 查询所有
     * @return
     */
    List<SynthesisDomain> findAll();
}
