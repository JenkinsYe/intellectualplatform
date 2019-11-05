package cn.zjcj.intellectualplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 综合信息实体类
 * @author YJJ
 * @date 2019-10-30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SynthesisDomain implements Serializable {
    private Integer id;
    private String name;
    private Integer year;
    private Double totalGDP;
    private Double primaryIndustryIncrement;
    private Double secondaryIndustryIncrement;
    private Double tertiaryIndustryIncrement;
    private Double industryIncrement;
    private Double perCapitaGDP;
    private Double GDPIndex;
    private Double primaryIndustryGDPIndex;
    private Double secondaryIndustryGDPIndex;
    private Double tertiaryIndustryGDPIndex;
    private Double industryProducerPriceIndex;

    @Override
    public String toString() {
        return "SynthesisDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", totalGDP=" + totalGDP +
                ", primaryIndustryIncrement=" + primaryIndustryIncrement +
                ", secondaryIndustryIncrement=" + secondaryIndustryIncrement +
                ", tertiaryIndustryIncrement=" + tertiaryIndustryIncrement +
                ", industryIncrement=" + industryIncrement +
                ", perCapitaGDP=" + perCapitaGDP +
                ", GDPIndex=" + GDPIndex +
                ", primaryIndustryGDPIndex=" + primaryIndustryGDPIndex +
                ", secondaryIndustryGDPIndex=" + secondaryIndustryGDPIndex +
                ", tertiaryIndustryGDPIndex=" + tertiaryIndustryGDPIndex +
                ", industryProducerPriceIndex=" + industryProducerPriceIndex +
                '}';
    }
}
