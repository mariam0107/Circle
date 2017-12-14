
package circle;

import java.util.Scanner;


public class Menu {
    Scanner sc=new Scanner(System.in);
    public boolean displayMenu()
    {
        int choice,ch;
        System.out.println("1.CIRCLE ");
        System.out.println("2.RECTANGLE ");
        System.out.println("3.TRIANGLE");
        System.out.println("4.EXIT PROGRAM");
        System.out.println("ENTER YOUR CHOICE");
        choice=sc.nextInt();
              
        switch(choice)
        {
            case 1:
                System.out.println("ENTER RADIUS");
                double rd=sc.nextInt();
                Circle c=new Circle(rd);
                System.out.println("1.CIRCLE AREA \n 2.CIRCUMFERENCE\n 3.OR BOTH");
                ch=sc.nextInt();
                if(ch==1)
                    System.out.println("THE AREA OF THE CIRCLE IS : "+c.calculateArea());
                else if(ch==2)
                    System.out.println("THE CIRCUMFERENCE OF THE CIRCLE IS :"+c.Circumference());
                else if(ch==3)
                    System.out.println(c);
            
            break;
            case 2:
                System.out.println("ENTER LENGTH AND WIDTH");
                double l=sc.nextInt();
                double w=sc.nextInt();
                 Rectangle r=new Rectangle(l,w);       
                System.out.println("1.RECTANGLE AREA \n 2.RECTANGLE PERIMETER\n 3.OR BOTH");
                ch=sc.nextInt();
                if(ch==1)
                   System.out.println("THE RECTANGLE AREA IS : "+r.area(l, w));
                else if(ch==2)
                    System.out.println("THE RECTANGLE PERIMETER IS : "+r.perimeter(l, w));
                else if(ch==3)
                    System.out.println(r);
                        break;
                        
            case 3:
                System.out.println("ENTER 3 sides of a triangle");
                double s1=sc.nextInt();
                double s2=sc.nextInt();
                double s3=sc.nextInt();
                boolean b=checkTriangle(s1,s2,s3);
                if(b)
                {
                 Triangle t=new Triangle(s1,s2,s3);   
                 System.out.println("1.TRIANGLE AREA \n 2.TRIANGLE PERIMETER\n 3.OR BOTH");
                ch=sc.nextInt();
                if(ch==1)
                   System.out.println("THE TRIANGLE AREA IS : "+t.area());
                    else if(ch==2)
                    System.out.println("THE TRIANGLE PERIMETER IS : "+t.perimeter());
                        
                else if(ch==3)
                    System.out.println(t);
                }
                else
                {
                    System.out.println("INVALID INPUT");
                }
                
                        break;
                        
            case 4:break;
            default:System.out.println("INVALID INPUT");
           
    }sc.nextLine();
        System.out.println("DO YOU WANT TO REPEAT THE OPERATIONS AGAIN(y/n)");
        String option=sc.nextLine();
        
        if(option.equalsIgnoreCase("y"))
            return true;
        else
            return false;
        
}
    public boolean checkTriangle(double a,double b,double c)
    {
        double big=a;
        if(big<b)
            big=b;
                  if(big<c)
                big=c;
                  if(big<a+b+c-big)
                      return true;
                  else
                      return false;
    }
}
