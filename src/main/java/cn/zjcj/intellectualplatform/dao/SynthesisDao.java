package cn.zjcj.intellectualplatform.dao;

import cn.zjcj.intellectualplatform.domain.SynthesisDomain;
import org.apache.ibatis.annotations.Param;

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

    /** 按名字查找 */
    List<SynthesisDomain> findByName(@Param("districtName") String name);

    /** 按年份查找 */
    List<SynthesisDomain> findByYear(@Param("year") Integer year);
}
