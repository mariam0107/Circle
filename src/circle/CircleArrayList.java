
package circle;

import java.util.ArrayList;


public class CircleArrayList {
    ArrayList<Circle> circleList=new ArrayList<>();
    public void addCircle(Circle c)
    {
        circleList.add(c); 
    }
    public void removeCircle(Circle c)
    {
        circleList.remove(c);
    }
    public void showCircles()
    {
        System.out.println(circleList);
    }

    
    
    
    
}
