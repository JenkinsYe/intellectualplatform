package cn.zjcj.intellectualplatform.dao;

import cn.zjcj.intellectualplatform.domain.EnvironmentDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 15:23 2019-11-09
 */
public interface EnvironmentDao {

    /** 根据地区查询 */
    List<EnvironmentDomain> findByName(@Param("districtName") String name);

    /** 根据年份查询 */
    List<EnvironmentDomain> findByYear(@Param("year") Integer year);
}
