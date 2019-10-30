package cn.zjcj.intellectualplatform.dao;

import cn.zjcj.intellectualplatform.domain.SynthesisDomain;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 15:03 2019-10-30
 */
public interface SynthesisDao {
    /** 查询所有综合信息 */
    List<SynthesisDomain> findAll();

    /** 插入记录 */
    void saveSynthesisDomain(SynthesisDomain domain);

}
