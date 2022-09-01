package lab.hw2;
import java.util.Scanner;

public class hw2 {
    static Scanner reader =new Scanner(System.in);
    public static void main(String[] args) {
        double a = 3.14;
        System.out.println("enter the diameter :");
        double diameter = reader.nextDouble();
        double circumference_of_a_circle=a*diameter;
        System.out.println("the circumference of a circle = " +circumference_of_a_circle);
        diameter=diameter/2;
        double circle_area=diameter*a;
        System.out.println(" the circle_area = " + circle_area);
    }
}