package cn.zjcj.intellectualplatform.service;

import cn.zjcj.intellectualplatform.domain.InvestmentDomain;
import cn.zjcj.intellectualplatform.domain.RevenueDomain;
import cn.zjcj.intellectualplatform.domain.SynthesisDomain;
import cn.zjcj.intellectualplatform.domain.TalentDomain;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 综合信息数据服务接口
 * @author YJJ
 * @Date: Created in 20:43 2019-11-02
 */
public interface DataService {

    /**
     * 综合信息查询
     * 根据地区名字查询
     * @param name
     * @return
     */
    List<SynthesisDomain> findSynthesisByName(String name);

    /**
     * 综合信息查询
     * 根据年份查询
     * @param year
     * @return
     */
    List<SynthesisDomain> findSynthesisByYear(Integer year);

    /**
     * 投资类信息查询
     * 根据地区名查询
     * @param name
     * @return
     */
    List<InvestmentDomain> findInvestmentByName(String name);

    /**
     * 投资类信息查询
     * 根据年份查询
     * @param year
     * @return
     */
    List<InvestmentDomain> findInvestmentByYear(Integer year);

    /**
     * 财政税收查询
     * 根据地区名查询
     * @param name
     * @return
     */
    List<RevenueDomain> findRevenueByName(String name);

    /**
     * 财政税收查询
     * 根据年份查询
     * @param year
     * @return
     */
    List<RevenueDomain> findRevenueByYear(Integer year);

    /**
     * 人才保障查询
     * 根据地区名查询
     * @param name
     * @return
     */
    List<TalentDomain> findTalentByName(String name);

    /**
     * 人才保障查询
     * 根据年份查询
     * @param year
     * @return
     */
    List<TalentDomain> findTalentByYear(Integer year);

}
