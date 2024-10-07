package www.coisini.xyz.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "mobileFoodFacilityPermit")
public class MobileFoodFacilityPermit implements Serializable {

    @Id
    String id;

    String locationId;
    String applicant;
    String facilityType;
    String cnn;
    String locationDescription;
    String address;
    String blocklot;
    String block;
    String lot;
    String permit;
    String status;
    String foodItems;
    String x;
    String y;
    String latitude;
    String longitude;
    String schedule;
    String dayshours;
    String noiSent;
    String approved;
    String received;
    String priorPermit;
    String expirationDate;
    String location;
    String firePreventionDistricts;
    String policeDistricts;
    String supervisorDistricts;
    String zipCodes;
    String NeighborhoodsOld;
}
