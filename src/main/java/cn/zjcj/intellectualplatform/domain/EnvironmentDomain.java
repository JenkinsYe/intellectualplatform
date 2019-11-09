package cn.zjcj.intellectualplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 环保保障实体类
 * @author YJJ
 * @Date: Created in 20:29 2019-11-06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnvironmentDomain {
    private Integer id;
    private String name;
    private Integer year;
    private Integer emergency;
    private Integer importantEvent;
    private Integer mediumEvent;
    private Integer generalEvent;
    private Integer industryPollutionInvestment;
    private Integer sewageInvestment;
    private Integer wasteGasInvestment;
    private Integer solidWasteInvestment;
    private Integer noiseInvestment;
    private Integer othersInvestment;
    private Integer industryPollutionTreatmentProject;

    @Override
    public String toString() {
        return "EnvironmentDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", emergency=" + emergency +
                ", importantEvent=" + importantEvent +
                ", mediumEvent=" + mediumEvent +
                ", generalEvent=" + generalEvent +
                ", industryPollutionInvestment=" + industryPollutionInvestment +
                ", sewageInvestment=" + sewageInvestment +
                ", wasteGasInvestment=" + wasteGasInvestment +
                ", solidWasteInvestment=" + solidWasteInvestment +
                ", noiseInvestment=" + noiseInvestment +
                ", othersInvestment=" + othersInvestment +
                ", industryPollutionTreatmentProject=" + industryPollutionTreatmentProject +
                '}';
    }
}
