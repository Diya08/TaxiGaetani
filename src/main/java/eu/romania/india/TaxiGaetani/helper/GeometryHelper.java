package eu.romania.india.TaxiGaetani.helper;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.util.GeometricShapeFactory;

public class GeometryHelper {

    public static Geometry createCircle(double latitude, double longitude, final double RADIUS) {
        GeometricShapeFactory shapeFactory = new GeometricShapeFactory();
        shapeFactory.setNumPoints(32);
        shapeFactory.setCentre(new Coordinate(longitude, latitude));//there are your coordinates
        shapeFactory.setSize(RADIUS * 2);//this is how you set the radius
        return shapeFactory.createCircle();
    }
}
