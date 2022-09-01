package lab3;

import java.util.Scanner;

public class hw6 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 0;
        System.out.printf("enter the number :");
        a = reader.nextInt();
        if (a == 2) {
            System.out.printf("it has 28 days");
        }
        else
        if (a == 4) {
            System.out.printf("it has 30 days");
        }
        else
            if(a==6) {
                System.out.printf("it has 30 days");

            }
            else
            if(a==9) {
                System.out.printf("it has 30 days");

            }
            else
            if(a==11) {
                System.out.printf("it has 30 days");

            }
            else

        for (int i = 0; i <= 12; i++) {
            if (a == i) {
                System.out.printf("it has 31 days");
            }
        }


        }
    }
