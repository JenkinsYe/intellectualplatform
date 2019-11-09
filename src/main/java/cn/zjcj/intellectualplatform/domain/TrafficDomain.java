package cn.zjcj.intellectualplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 交通物流保障
 * @author YJJ
 * @Date: Created in 14:53 2019-11-07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrafficDomain {
    private Integer id;
    private String name;
    private Integer year;
    private Integer numberOfRailTraffic;
    private Integer totalLengthOfRailTraffic;
    private Integer passengerOfRailTraffic;
    private Double lengthOfRailroadInService;
    private Double lengthOfInlandWaterway;
    private Double lengthOfHighway;
    private Double lengthOfClassifiedHighway;
    private Double lengthOfClassifiedExpressway;
    private Double lengthOfFirstClassHighway;
    private Double lengthOfSecondClassHighway;
    private Integer freight;
    private Integer railFreight;
    private Integer highwayFreight;
    private Integer waterwayFreight;
    private Double freightTurnover;
    private Double railFreightTurnover;
    private Double highwayFreightTurnover;
    private Double waterwayFreightTurnover;

    @Override
    public String toString() {
        return "TrafficDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", numberOfRailTraffic=" + numberOfRailTraffic +
                ", totalLengthOfRailTraffic=" + totalLengthOfRailTraffic +
                ", passengerOfRailTraffic=" + passengerOfRailTraffic +
                ", lengthOfRailroadInService=" + lengthOfRailroadInService +
                ", lengthOfInlandWaterway=" + lengthOfInlandWaterway +
                ", lengthOfHighway=" + lengthOfHighway +
                ", lengthOfClassifiedHighway=" + lengthOfClassifiedHighway +
                ", lengthOfClassifiedExpressway=" + lengthOfClassifiedExpressway +
                ", lengthOfFirstClassHighway=" + lengthOfFirstClassHighway +
                ", lengthOfSecondClassHighway=" + lengthOfSecondClassHighway +
                ", freight=" + freight +
                ", railFreight=" + railFreight +
                ", highwayFreight=" + highwayFreight +
                ", waterwayFreight=" + waterwayFreight +
                ", freightTurnover=" + freightTurnover +
                ", railFreightTurnover=" + railFreightTurnover +
                ", highwayFreightTurnover=" + highwayFreightTurnover +
                ", waterwayFreightTurnover=" + waterwayFreightTurnover +
                '}';
    }
}
