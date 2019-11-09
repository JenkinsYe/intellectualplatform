package cn.zjcj.intellectualplatform.dao;

import cn.zjcj.intellectualplatform.domain.LandDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 15:45 2019-11-09
 */
public interface LandDao {

    /** 根据地区查询 */
    List<LandDomain> findByName(@Param("districtName") String name);

    /** 根据年份查询 */
    List<LandDomain> findByYear(@Param("year") Integer year);
}
