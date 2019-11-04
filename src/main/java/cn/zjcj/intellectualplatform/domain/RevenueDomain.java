package cn.zjcj.intellectualplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author YJJ
 * @Date: Created in 15:50 2019-11-04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RevenueDomain implements Serializable {
    private Integer id;
    private String name;
    private Integer year;
    private Double generalBudgetaryIncome;
    private Double taxIncome;
    private Double generalBudgetaryExpense;
    private Double scientificExpense;
    private Double securityAndEmploymentExpense;
    private Double environmentExpense;

    @Override
    public String toString() {
        return "RevenueDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", generalBudgetaryIncome=" + generalBudgetaryIncome +
                ", taxIncome=" + taxIncome +
                ", generalBudgetaryExpense=" + generalBudgetaryExpense +
                ", scientificExpense=" + scientificExpense +
                ", securityAndEmploymentExpense=" + securityAndEmploymentExpense +
                ", environmentExpense=" + environmentExpense +
                '}';
    }
}
