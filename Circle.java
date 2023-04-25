import java.util.*;

public class Circle{
  private double r;
  public static double PI = Math.PI;
  public Circle(double radius){
     r = radius; 
  }
  
  public double getRadius(){
    return r; 
  }
  
  public double getArea(){
    return r * r * PI;
  }
}
