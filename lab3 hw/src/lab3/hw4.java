package lab3;

import java.util.Scanner;

public class hw4 {

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
        if(a==b&&a==c&&b==c){
            System.out.println("the numbers are the same ");

        }
      else  if(a!=b&&a!=c&&b!=c){
            System.out.println("the numbers are different ");
        }

        else{
            System.out.println(" no one ");
        }
    }
}
