
package circle;

import java.util.Scanner;


public class ReadData {
    Scanner sc=new Scanner(System.in);
    private double radius,length,width,s1,s2,s3;
    public void readDataCircle()
    {
        
        System.out.println("ENTER THE RADIUS");
        radius=sc.nextDouble();
        
    }
    public double getRadius(){
        return radius;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getS1(){
        return s1;
    }
    public double getS2(){
        return s2;
    }
    public double getS3(){
        return s3;
    }
    public void readDataRectangle()
    {
        
        System.out.println("ENTER THE LENGTH AND WIDTH");
        length=sc.nextDouble();
        width=sc.nextDouble();
    }
    public void readDataTriangle()
    {
        
        System.out.println("ENTER THE 3 SIDES");
        s1=sc.nextDouble();
        s2=sc.nextDouble();
        s3=sc.nextDouble();
    }
}
