package lab.hw2;

import java.util.Scanner;

public class hw4 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
double a=0;
double b=0;
double c=0;
        System.out.println("enter the first number : ");
        System.out.println("enter the second number : ");
        System.out.println("enter the third number : ");
a=reader.nextDouble();
b=reader.nextDouble();
c=reader.nextDouble();
double avg=(a+b+c)/2;
        System.out.printf("the avg is = " + avg);
    }
}