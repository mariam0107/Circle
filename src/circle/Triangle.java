//
package circle;


public class Triangle {
private double s1,s2,s3;
private double area;
private double perimeter;
    public Triangle() {
    }

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public double getArea() {
        return area;
    }

    

    public double getPerimeter() {
        return perimeter;
    }

       
    public double perimeter()
    {
        perimeter=s1+s2+s3;
        return perimeter;
    }
    public double area()
    {
        double p=perimeter()/2.0;
        
        return (Math.sqrt((p)*(p-s1)*(p-s2)*(p-s3)));
    }

    @Override
    public String toString() {
        return "s1 :"+s1+"s2   :"+s2+"s3  :"+s3+"Area  :"+area()+"Perimeter"+perimeter()+"\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
