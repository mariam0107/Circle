
package circle;
import java.lang.Math;

public class Circle {
  private static final double PI = 3.1416;
  private double radius;
  private double area;
  private double circumference;
  public Circle()
  {
      
  }
public Circle(double radius)
{
    this.radius=radius;
}
public double getRadius()
{
    return radius;
}
public void setRadius(double radius)
{
    this.radius=radius;
}
   public double calculateArea() 
   {
       area=PI*Math.pow(getRadius(),2);
       return area;
   }
   public double Circumference()
   {
       circumference=2*PI*radius;
       return circumference;
   }

    @Override
    public String toString() {
        return "Radius"+this.radius+"Area"+Math.ceil(calculateArea())+"Circumference"+Math.ceil(Circumference())+"\n"; //To change body of generated methods, choose Tools | Templates.
    }
   

    
}
