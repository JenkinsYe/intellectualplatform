package cn.zjcj.intellectualplatform.dao;

import cn.zjcj.intellectualplatform.domain.WaterDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 16:21 2019-11-09
 */
public interface WaterDao {

    /** 根据地区名查 */
    List<WaterDomain> findByName(@Param("districtName") String name);

    /** 根据年份查 */
    List<WaterDomain> findByYear(@Param("year") Integer year);
}
