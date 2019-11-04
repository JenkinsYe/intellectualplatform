package cn.zjcj.intellectualplatform.dao;

import cn.zjcj.intellectualplatform.domain.RevenueDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 15:58 2019-11-04
 */
public interface RevenueDao {

    /** 根据地区查询 */
    List<RevenueDomain> findByName(@Param("districtName") String name);

    /** 根据年份查询 */
    List<RevenueDomain> findByYear(@Param("year") Integer year);
}
