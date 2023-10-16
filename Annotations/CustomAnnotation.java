package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// meta-data annotation by specifying applicable element type.
@Target(ElementType.TYPE)
//TYPE means it is applicable to class, interface, abstract class or enum.

@Retention(RetentionPolicy.RUNTIME)

//Defining new annotation using @interface keyword.
@interface GeometryInfo{
    public String shapeName();
    
    public int numberOfEdges();
}

@GeometryInfo(shapeName = "Regular Octagon",numberOfEdges = 8)
class GeoShape{
    public int getInteriorAngle(int numberOfEdges){
        return 180-360/numberOfEdges;
    }

}
public class CustomAnnotation {

    public static void main(String[] args) {
        GeoShape geoShape= new GeoShape();

        GeometryInfo geoInfo= geoShape.getClass().getAnnotation(GeometryInfo.class);

        System.out.println("Shape Name: "+geoInfo.shapeName());

        System.out.println("Number of edges: "+geoInfo.numberOfEdges());

        System.out.println("Interior Angle: "+geoShape.getInteriorAngle(geoInfo.numberOfEdges()));

    }
}
