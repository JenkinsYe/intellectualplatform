package cn.zjcj.intellectualplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 人才保障实体类
 * @author YJJ
 * @Date: Created in 20:28 2019-11-04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TalentDomain implements Serializable {
    private Integer id;
    private String name;
    private Integer year;
    private Integer yearEndResidentPopulation;
    private Integer urbanPopulation;
    private Integer ruralPopulation;
    private Double urbanOrganizationEmployer;
    private Double miningUrbanOrganizationEmployer;
    private Double manufactureUrbanOrganizationEmployer;
    private Double electricFuelWaterSupplyOrganizationEmployer;
    private Double industryUrbanOrganizationEmployer;
    private Double urbanOrganizationEmployerSalaryAmount;
    private Double miningUrbanOrganizationEmployerSalaryAmount;
    private Double manufactureUrbanOrganizationEmployerSalaryAmount;
    private Double electricFuelWaterSupplyOrganizationEmployerSalaryAmount;
    private Double industryUrbanOrganizationEmployerSalaryAmount;
    private Integer urbanOrganizationEmployerSalaryAverage;
    private Integer miningUrbanOrganizationEmployerSalaryAverage;
    private Integer manufactureUrbanOrganizationEmployerSalaryAverage;
    private Integer electricFuelWaterSupplyOrganizationEmployerSalaryAverage;
    private Double urbanRegistrationUnemployedPerson;
    private Double urbanRegistrationUnemployedRate;
    private Integer urbanPopulationDensity;
    private Double secondaryVocationalSchoolEnrollment;
    private Double secondaryVocationalSchoolStudent;
    private Double secondaryVocationalSchoolGraduate;
    private Double secondaryVocationalSchoolGraduateWithCertificate;
    private Double secondaryVocationalSchoolExpectedGraduate;
    private Double secondaryVocationalSchoolStaff;
    private Double secondaryVocationalSchoolTeacher;
    private Double injuryInsuranceYearEndPopulation;
    private Double injuryInsurancePopulation;
    private Integer injuryInsuranceFundIncome;
    private Integer injuryInsuranceFundExpense;
    private Integer injuryInsuranceBalance;

    @Override
    public String toString() {
        return "TalentDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", yearEndResidentPopulation=" + yearEndResidentPopulation +
                ", urbanPopulation=" + urbanPopulation +
                ", ruralPopulation=" + ruralPopulation +
                ", urbanOrganizationEmployer=" + urbanOrganizationEmployer +
                ", miningUrbanOrganizationEmployer=" + miningUrbanOrganizationEmployer +
                ", manufactureUrbanOrganizationEmployer=" + manufactureUrbanOrganizationEmployer +
                ", electricFuelWaterSupplyOrganizationEmployer=" + electricFuelWaterSupplyOrganizationEmployer +
                ", industryUrbanOrganizationEmployer=" + industryUrbanOrganizationEmployer +
                ", urbanOrganizationEmployerSalaryAmount=" + urbanOrganizationEmployerSalaryAmount +
                ", miningUrbanOrganizationEmployerSalaryAmount=" + miningUrbanOrganizationEmployerSalaryAmount +
                ", manufactureUrbanOrganizationEmployerSalaryAmount=" + manufactureUrbanOrganizationEmployerSalaryAmount +
                ", electricFuelWaterSupplyOrganizationEmployerSalaryAmount=" + electricFuelWaterSupplyOrganizationEmployerSalaryAmount +
                ", industryUrbanOrganizationEmployerSalaryAmount=" + industryUrbanOrganizationEmployerSalaryAmount +
                ", urbanOrganizationEmployerSalaryAverage=" + urbanOrganizationEmployerSalaryAverage +
                ", miningUrbanOrganizationEmployerSalaryAverage=" + miningUrbanOrganizationEmployerSalaryAverage +
                ", manufactureUrbanOrganizationEmployerSalaryAverage=" + manufactureUrbanOrganizationEmployerSalaryAverage +
                ", electricFuelWaterSupplyOrganizationEmployerSalaryAverage=" + electricFuelWaterSupplyOrganizationEmployerSalaryAverage +
                ", urbanRegistrationUnemployedPerson=" + urbanRegistrationUnemployedPerson +
                ", urbanRegistrationUnemployedRate=" + urbanRegistrationUnemployedRate +
                ", urbanPopulationDensity=" + urbanPopulationDensity +
                ", secondaryVocationalSchoolEnrollment=" + secondaryVocationalSchoolEnrollment +
                ", secondaryVocationalSchoolStudent=" + secondaryVocationalSchoolStudent +
                ", secondaryVocationalSchoolGraduate=" + secondaryVocationalSchoolGraduate +
                ", secondaryVocationalSchoolGraduateWithCertificate=" + secondaryVocationalSchoolGraduateWithCertificate +
                ", secondaryVocationalSchoolExpectedGraduate=" + secondaryVocationalSchoolExpectedGraduate +
                ", secondaryVocationalSchoolStaff=" + secondaryVocationalSchoolStaff +
                ", secondaryVocationalSchoolTeacher=" + secondaryVocationalSchoolTeacher +
                ", injuryInsuranceYearEndPopulation=" + injuryInsuranceYearEndPopulation +
                ", injuryInsurancePopulation=" + injuryInsurancePopulation +
                ", injuryInsuranceFundIncome=" + injuryInsuranceFundIncome +
                ", injuryInsuranceFundExpense=" + injuryInsuranceFundExpense +
                ", injuryInsuranceBalance=" + injuryInsuranceBalance +
                '}';
    }
}
