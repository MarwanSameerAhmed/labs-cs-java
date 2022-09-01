package lab.hw2;

import java.util.Scanner;

public class hw3 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double length ;
        double width;
        System.out.println("enter the length :");
        System.out.println("enter the width :");
        length = reader.nextDouble();
        width = reader.nextDouble();
        double circumference_of_a_rectangle= length * width;
        System.out.println("the circumference of a rectangle = " +circumference_of_a_rectangle);

        double rectangle_area=2*circumference_of_a_rectangle;
        System.out.println(" the rectangle area = " + rectangle_area);
    }
}