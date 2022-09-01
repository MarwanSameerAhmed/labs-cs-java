package lab.hw2;

import java.util.Scanner;

public class hw6 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        String a ="hello";
        String b ="world";
        System.out.println(a.length()+b.length());
        System.out.println(a.substring(1,2));
        System.out.println(a.substring(a.length()/2,a.length()));
        System.out.println(a+b);
        System.out.println(b+a);
    }
}