
package circle;


public class Rectangle {
private double length;
private double width;
public Rectangle()
{
    
}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

     public double perimeter(double length,double width)
  {
      double p=2*(length+width); 
      return p;
  }
  public double area(double length,double width)
  {
      double a=length*width;
      return a;
  }

    @Override
    public String toString() {
        return "length :"+length+"breadth   :"+width+"Area  :"+Math.ceil(area(length,width))+"Perimeter"+Math.ceil(perimeter(length,width))+"\n"; 
    }
  

}
