package lab.hw2;

import java.util.Scanner;

public class hw7 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double a=0;
        double b=0;
        System.out.println("enter the first number :");
        System.out.println("enter the second number :");
        a=reader.nextDouble();
        b=reader.nextDouble();
         double c=a+b;
        System.out.println("the total = " +c);
        double z=a-b;
        System.out.println("the subtraction = " +z);
        double x=a*b;
        System.out.println("the porduct = "+ x);

                double v=2/(a+b);
        System.out.println("the avg = " +v);
        double n=a%b;
        System.out.println("the distance = "+n);
        if (a>b){
            System.out.println( "the second number "+"(" +a+")" + " is the maximum(the large number)");

        }
        else{
            System.out.println( "the second number "+"(" +b+")" + " is the maximum(the large number)");
        }

    }
}
