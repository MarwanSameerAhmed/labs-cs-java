package lab3;

import java.util.Scanner;

public class hw5 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double a ;
        double b;
        double c;
        System.out.println("enter the first number :");
        System.out.println("enter the second number :");
        System.out.println("enter the third number :");
        a=reader.nextDouble();
        b=reader.nextDouble();
        c=reader.nextDouble();

        if(a<b&&b<c){
            System.out.printf("increasing");
        }
      else   if(a>b&&b>c){
            System.out.printf("decreasing");

        }
        else{
            System.out.printf("neither");
        }
    }
}
