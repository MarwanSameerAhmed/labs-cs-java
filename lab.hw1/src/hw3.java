import java.util.Scanner;

public class hw3 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int num ;
        System.out.println("enter the number :");
        num = reader.nextInt();
        System.out.printf("factorial = " + fact(num));


    }

    public static int fact(int a) {

        if(a == 1 || a == 0)
            return 1;
        else
            return a * fact(a-1);

    }

}
