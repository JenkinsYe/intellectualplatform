package cn.zjcj.intellectualplatform.dao;

import cn.zjcj.intellectualplatform.domain.EnergyDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 15:09 2019-11-09
 */
public interface EnergyDao {

    /** 根据地区查询 */
    List<EnergyDomain> findByName(@Param("districtName") String name);

    /** 根据年份查询 */
    List<EnergyDomain> findByYear(@Param("year") Integer year);
}
