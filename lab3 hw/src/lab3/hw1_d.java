package lab3;

import java.util.Scanner;

public class hw1_d {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double x = 0;
        double y = 1;
        if (Math.abs(x - y) < 1)
        { System.out.print(x); }
        else { System.out.print(y); }
    }
}
