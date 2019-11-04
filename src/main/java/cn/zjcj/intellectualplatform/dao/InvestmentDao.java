package cn.zjcj.intellectualplatform.dao;

import cn.zjcj.intellectualplatform.domain.InvestmentDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 14:55 2019-11-04
 */
public interface InvestmentDao {

    /** 根据地区查询 */
    List<InvestmentDomain> findByName(@Param("districtName") String name);

    /** 根据年份查询 */
    List<InvestmentDomain> findByYear(@Param("year") Integer year);
}
