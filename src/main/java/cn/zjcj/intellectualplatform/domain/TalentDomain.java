package cn.zjcj.intellectualplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
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
    private Double yearEndResidentPopulation;
    private Double urbanPopulation;
    private Double ruralPopulation;
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
    private Double urbanOrganizationEmployerSalaryAverage;
    private Double miningUrbanOrganizationEmployerSalaryAverage;
    private Double manufactureUrbanOrganizationEmployerSalaryAverage;
    private Double electricFuelWaterSupplyOrganizationEmployerSalaryAverage;
    private Double urbanRegistrationUnemployedPerson;
    private Double urbanRegistrationUnemployedRate;
    private Double urbanPopulationDensity;
    private Double secondaryVocationalSchoolEnrollment;
    private Double secondaryVocationalSchoolStudent;
    private Double secondaryVocationalSchoolGraduate;
    private Double secondaryVocationalSchoolGraduateWithCertificate;
    private Double secondaryVocationalSchoolExpectedGraduate;
    private Double secondaryVocationalSchoolStaff;
    private Double secondaryVocationalSchoolTeacher;
    private Double noInjuryInsuranceYearEndPopulation;
    private Double injuryInsurancePopulation;
    private Double injuryInsuranceFundIncome;
    private Double injuryInsuranceFundExpense;
    private Double injuryInsuranceBalance;

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
                ", noInjuryInsuranceYearEndPopulation=" + noInjuryInsuranceYearEndPopulation +
                ", injuryInsurancePopulation=" + injuryInsurancePopulation +
                ", injuryInsuranceFundIncome=" + injuryInsuranceFundIncome +
                ", injuryInsuranceFundExpense=" + injuryInsuranceFundExpense +
                ", injuryInsuranceBalance=" + injuryInsuranceBalance +
                '}';
    }
}
