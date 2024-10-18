package Libraries_2.Problem41;
import java.util.*;

class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
}

public class Main{
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);

        HashSet<Circle> hs = new HashSet<>(); 

        hs.add(c1);
        hs.add(c2);
        hs.add(c2);

        System.out.println(hs);


        // TreeSet<Circle> ts = new TreeSet<>();

        // ts.add(c1);
        // ts.add(c2);
    }
    }