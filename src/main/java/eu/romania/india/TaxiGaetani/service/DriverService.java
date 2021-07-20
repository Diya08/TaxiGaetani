package eu.romania.india.TaxiGaetani.service;

import eu.romania.india.TaxiGaetani.entity.Driver;
import eu.romania.india.TaxiGaetani.helper.GeometryHelper;
import eu.romania.india.TaxiGaetani.repository.DriverRepository;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.util.GeometricShapeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService implements IDriverService{

    @Autowired
    private DriverRepository driverRepository;

    public Driver getDriverRegistration() {
        return new Driver();
    }

    @Override
    public List<Driver> findBasedOnLocation(Double latitude, Double longitude) {
        Geometry circle = GeometryHelper.createCircle(latitude, longitude, 2);
        return driverRepository.findByBasedOnLocation(circle);
    }

        @Override
        public Driver save(Driver driver){
            return driverRepository.save(driver);
        }
        @Override
        public Driver updateDriverLocation(Integer driverId, double latitude, double longitude){
            Optional<Driver> driverOptional = driverRepository.findById(driverId);
            if(!driverOptional.isPresent()){
                throw new IllegalArgumentException("driver "+driverId+ " not found");
            }
            Driver driver = driverOptional.get();
            GeometryFactory geometryFactory = new GeometryFactory();
            Coordinate coord = new Coordinate(longitude, latitude);
            Point point = geometryFactory.createPoint(coord);
            driver.setCurrentLocation(point);
            driverRepository.save(driver);
            return driver;
        }
}
