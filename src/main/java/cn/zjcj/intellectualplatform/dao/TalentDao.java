package cn.zjcj.intellectualplatform.dao;

import cn.zjcj.intellectualplatform.domain.TalentDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author YJJ
 * @Date: Created in 21:27 2019-11-04
 */
public interface TalentDao {

    /** 根据地区名查 */
    List<TalentDomain> findByName(@Param("districtName") String name);

    /** 根据年份查 */
    List<TalentDomain> findByYear(@Param("year") Integer year);
}
