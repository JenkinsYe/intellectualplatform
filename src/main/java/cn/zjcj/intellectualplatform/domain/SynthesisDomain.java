package cn.zjcj.intellectualplatform.domain;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author YJJ
 * @date 2019-10-30
 */
public class SynthesisDomain implements Serializable {
    private Integer id;
    private String name;
    private Integer year;
    private Double totalGDP;
    private Double primaryIndustryGDP;
    private Double secondaryIndustryGDP;
    private Double tertiaryIndustryGDP;
    private Double industryIncrement;
    private Double perCapitaGDP;
    private Double GDPIndex;
    private Double primaryIndustryGDPIndex;
    private Double secondaryIndustryGDPIndex;
    private Double tertiaryIndustryGDPIndex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getTotalGDP() {
        return totalGDP;
    }

    public void setTotalGDP(Double totalGDP) {
        this.totalGDP = totalGDP;
    }

    public Double getPrimaryIndustryGDP() {
        return primaryIndustryGDP;
    }

    public void setPrimaryIndustryGDP(Double primaryIndustryGDP) {
        this.primaryIndustryGDP = primaryIndustryGDP;
    }

    public Double getSecondaryIndustryGDP() {
        return secondaryIndustryGDP;
    }

    public void setSecondaryIndustryGDP(Double secondaryIndustryGDP) {
        this.secondaryIndustryGDP = secondaryIndustryGDP;
    }

    public Double getTertiaryIndustryGDP() {
        return tertiaryIndustryGDP;
    }

    public void setTertiaryIndustryGDP(Double tertiaryIndustryGDP) {
        this.tertiaryIndustryGDP = tertiaryIndustryGDP;
    }

    public Double getIndustryIncrement() {
        return industryIncrement;
    }

    public void setIndustryIncrement(Double industryIncrement) {
        this.industryIncrement = industryIncrement;
    }

    public Double getPerCapitaGDP() {
        return perCapitaGDP;
    }

    public void setPerCapitaGDP(Double perCapitaGDP) {
        this.perCapitaGDP = perCapitaGDP;
    }

    public Double getGDPIndex() {
        return GDPIndex;
    }

    public void setGDPIndex(Double GDPIndex) {
        this.GDPIndex = GDPIndex;
    }

    public Double getPrimaryIndustryGDPIndex() {
        return primaryIndustryGDPIndex;
    }

    public void setPrimaryIndustryGDPIndex(Double primaryIndustryGDPIndex) {
        this.primaryIndustryGDPIndex = primaryIndustryGDPIndex;
    }

    public Double getSecondaryIndustryGDPIndex() {
        return secondaryIndustryGDPIndex;
    }

    public void setSecondaryIndustryGDPIndex(Double secondaryIndustryGDPIndex) {
        this.secondaryIndustryGDPIndex = secondaryIndustryGDPIndex;
    }

    public Double getTertiaryIndustryGDPIndex() {
        return tertiaryIndustryGDPIndex;
    }

    public void setTertiaryIndustryGDPIndex(Double tertiaryIndustryGDPIndex) {
        this.tertiaryIndustryGDPIndex = tertiaryIndustryGDPIndex;
    }

    @Override
    public String toString() {
        return "SynthesisDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", totalGDP=" + totalGDP +
                ", primaryIndustryGDP=" + primaryIndustryGDP +
                ", secondaryIndustryGDP=" + secondaryIndustryGDP +
                ", tertiaryIndustryGDP=" + tertiaryIndustryGDP +
                ", industryIncrement=" + industryIncrement +
                ", perCapitaGDP=" + perCapitaGDP +
                ", GDPIndex=" + GDPIndex +
                ", primaryIndustryGDPIndex=" + primaryIndustryGDPIndex +
                ", secondaryIndustryGDPIndex=" + secondaryIndustryGDPIndex +
                ", tertiaryIndustryGDPIndex=" + tertiaryIndustryGDPIndex +
                '}';
    }
}
