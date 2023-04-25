import java.util.*;
public class Sphere {
    private static final double pi = Math.PI;
    private double radius;

    public Sphere(double r ){
        radius = r;
    }

    public double getRadius(){return this.radius;}

    public double getVolume(){return (double) 4/3 * pi * Math.pow(radius, 3);}



}
