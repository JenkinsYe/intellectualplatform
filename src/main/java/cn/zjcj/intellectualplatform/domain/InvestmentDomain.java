package cn.zjcj.intellectualplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 投资实体类
 * @author YJJ
 * @Date: Created in 14:50 2019-11-04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvestmentDomain implements Serializable {
    private Integer id;
    private String name;
    private Integer year;
    private Double societyFixedAssetsInvestment;
    private Double miningSocietyFixedAssetsInvestment;
    private Double manufactureSocietyFixedAssetsInvestment;
    private Double electricityFuelWaterSupplySocietyFixedAssetsInvestment;
    private Double industrySocietyFixedAssetsInvestment;

    @Override
    public String toString() {
        return "InvestmentDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", societyFixedAssetsInvestment=" + societyFixedAssetsInvestment +
                ", miningSocietyFixedAssetsInvestment=" + miningSocietyFixedAssetsInvestment +
                ", manufactureSocietyFixedAssetsInvestment=" + manufactureSocietyFixedAssetsInvestment +
                ", electricityFuelWaterSupplySocietyFixedAssetsInvestment=" + electricityFuelWaterSupplySocietyFixedAssetsInvestment +
                ", industrySocietyFixedAssetsInvestment=" + industrySocietyFixedAssetsInvestment +
                '}';
    }
}
