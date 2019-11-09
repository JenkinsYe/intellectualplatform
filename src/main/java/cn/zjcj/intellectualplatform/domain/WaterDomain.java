package cn.zjcj.intellectualplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 水资源保障实体类
 * @author YJJ
 * @Date: Created in 16:37 2019-11-05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaterDomain {
    private Integer id;
    private String name;
    private Integer year;
    private Double waterSupplyProductivity;
    private Integer waterPipeLength;
    private Double waterSupplyMassAmount;
    private Double livingWaterMassAmount;
    private Double productionWaterMassAmount;
    private Double waterPopulation;
    private Double waterConsumptionPerPersonPerDay;
    private Double sewageTreatmentPerDay;
    private Double waterResourceAmount;
    private Double surfaceWaterResourceAmount;
    private Double undergroundWaterResourceAmount;
    private Double surfaceAndUndergroundRepetition;
    private Double waterResourcePerPerson;
    private Double waterSupplyVolumeAmount;
    private Double waterConsumptionVolumeAmount;
    private Double industryWaterConsumptionVolumeAmount;

    @Override
    public String toString() {
        return "WaterDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", waterSupplyProductivity=" + waterSupplyProductivity +
                ", waterPipeLength=" + waterPipeLength +
                ", waterSupplyMassAmount=" + waterSupplyMassAmount +
                ", livingWaterMassAmount=" + livingWaterMassAmount +
                ", productionWaterMassAmount=" + productionWaterMassAmount +
                ", waterPopulation=" + waterPopulation +
                ", waterConsumptionPerPersonPerDay=" + waterConsumptionPerPersonPerDay +
                ", sewageTreatmentPerDay=" + sewageTreatmentPerDay +
                ", waterResourceAmount=" + waterResourceAmount +
                ", surfaceWaterResourceAmount=" + surfaceWaterResourceAmount +
                ", undergroundWaterResourceAmount=" + undergroundWaterResourceAmount +
                ", surfaceAndUndergroundRepetition=" + surfaceAndUndergroundRepetition +
                ", waterResourcePerPerson=" + waterResourcePerPerson +
                ", waterSupplyVolumeAmount=" + waterSupplyVolumeAmount +
                ", waterConsumptionVolumeAmount=" + waterConsumptionVolumeAmount +
                ", industryWaterConsumptionVolumeAmount=" + industryWaterConsumptionVolumeAmount +
                '}';
    }
}
