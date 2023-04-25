public class Rectangle{
  private double width;
  private double length;
  
  public Rectangle(double width, double length){
    this.width = width;
    this.length = length;
  }
  
  public double getWidth(){
    return this.width;
  }
  
  public double getLength(){
    return this.length;
  }
  
  public double getArea(){
    return length * width;
  }
  
  public double getPerimeter(){
    return (length + width) * 2;
  }
 
}
