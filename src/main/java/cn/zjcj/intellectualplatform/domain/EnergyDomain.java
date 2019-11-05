package cn.zjcj.intellectualplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 能源保障实体类
 * @author YJJ
 * @Date: Created in 21:41 2019-11-04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnergyDomain {
    private Integer id;
    private String name;
    private Integer year;
    private Double coal;
    private Double coke;
    private Double crude;
    private Double gasoline;
    private Double kerosene;
    private Double diesel;
    private Double fuelOil;
    private Double natgas;
    private Double electricity;
    private Double energyPerGDP;
    private Double energyPerGDPGrowth;
    private Double energyPerIndustryIncrement;
    private Double energyPerIndustryIncrementGrowth;
    private Double electricityPerGDP;
    private Double electricityPerGDPGrowth;

    @Override
    public String toString() {
        return "EnergyDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", coal=" + coal +
                ", coke=" + coke +
                ", crude=" + crude +
                ", gasoline=" + gasoline +
                ", kerosene=" + kerosene +
                ", diesel=" + diesel +
                ", fuelOil=" + fuelOil +
                ", natgas=" + natgas +
                ", electricity=" + electricity +
                ", energyPerGDP=" + energyPerGDP +
                ", energyPerGDPGrowth=" + energyPerGDPGrowth +
                ", energyPerIndustryIncrement=" + energyPerIndustryIncrement +
                ", energyPerIndustryIncrementGrowth=" + energyPerIndustryIncrementGrowth +
                ", electricityPerGDP=" + electricityPerGDP +
                ", electricityPerGDPGrowth=" + electricityPerGDPGrowth +
                '}';
    }
}
