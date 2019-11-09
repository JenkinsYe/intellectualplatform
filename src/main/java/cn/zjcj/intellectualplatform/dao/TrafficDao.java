package cn.zjcj.intellectualplatform.dao;

import cn.zjcj.intellectualplatform.domain.TrafficDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 16:09 2019-11-09
 */
public interface TrafficDao {

    /** 根据地区名查 */
    List<TrafficDomain> findByName(@Param("districtName") String name);

    /** 根据年份查 */
    List<TrafficDomain> findByYear(@Param("year") Integer year);
}
