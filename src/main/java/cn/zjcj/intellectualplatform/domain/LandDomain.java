package cn.zjcj.intellectualplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 土地保障实体类
 * @author YJJ
 * @Date: Created in 16:01 2019-11-05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LandDomain {
    private Integer id;
    private String name;
    private Integer year;
    private Double urbanArea;
    private Double builtUpArea;
    private Double urbanConstructionLandArea;
    private Double requisitionLandArea;

    @Override
    public String toString() {
        return "LandDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", urbanArea=" + urbanArea +
                ", builtUpArea=" + builtUpArea +
                ", urbanConstructionLandArea=" + urbanConstructionLandArea +
                ", requisitionLandArea=" + requisitionLandArea +
                '}';
    }
}
