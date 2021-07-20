package eu.romania.india.TaxiGaetani.entity;

//import org.geolatte.geom.Point;
//import com..jts.geom.Point;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.locationtech.jts.geom.Point;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TX_DRIVER")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Driver extends UserAbstract{

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "available")
    private Boolean available;

    @Column(columnDefinition = "geometry")
    private Point currentLocation;

}
