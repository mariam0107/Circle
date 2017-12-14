
package circle;

import java.util.Scanner;


public class AreaorPerimeter {
    Scanner sc=new Scanner(System.in);
    int choice;
    public int displaySubMenuCircle()
    {
        
        System.out.println("1.CIRCLE AREA");
        System.out.println("2.CIRCLE PERIMETER");
        System.out.println("ENTER YOUR CHOICE");
        choice=sc.nextInt();
        return choice;
        
    }
    public int displaySubMenuRectangle()
    {
        System.out.println(" RECTANGLE AREA");
        System.out.println("RECTANGLE PERIMETER");
        System.out.println("ENTER YOUR CHOICE");
        choice=sc.nextInt();
        return choice;
        
    }
    public int displaySubMenuTriangle()
    {
        System.out.println("TRIANGLE AREA");
        System.out.println("TRIANGLE PERIMETER");
        System.out.println("ENTER YOUR CHOICE");
        choice=sc.nextInt();
        return choice;
        
    }
}
