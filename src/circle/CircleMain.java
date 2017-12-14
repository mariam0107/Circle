
package circle;


public class CircleMain {
    public static void main(String[] args) {
        CircleArrayList cL=new CircleArrayList();
        
        Circle c1=new Circle(1.0);
        Circle c2=new Circle(1.2);
        Circle c3=new Circle(1.3);
        
        c1.calculateArea();
        c2.calculateArea();
        c3.calculateArea();
        
        c1.Circumference();
        c2.Circumference();
        c3.Circumference();
        
        cL.addCircle(c1);
        cL.addCircle(c2);
        cL.addCircle(c3);
        
        
        
        
        cL.showCircles();
//        System.out.println();
//        System.out.println();
    }
}
