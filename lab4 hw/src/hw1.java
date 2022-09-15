import java.awt.*;

public class hw1 {
    public static void main (String[]arg){
        Rectangle home = new Rectangle(500,400);
        home.getWidth();
        home.getHeight();
        double rec = home.getHeight()*home.getWidth();
        System.out.println(home.getHeight());
        System.out.println("expected answer 400");
        System.out.println(home.getWidth());
        System.out.println("expected answer 500 ");
        System.out.println(rec);
        System.out.println("expected answer 200.000");


    }
}
