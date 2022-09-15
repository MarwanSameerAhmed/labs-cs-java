import java.util.Random;
import java.util.Scanner;

public class hw6 {
   static Scanner reader = new Scanner(System.in);
    public static void main (String[]arg){
        int a ;
        System.out.println("enter the first number :");
        a=reader.nextInt();
        int b = 0 ;
        System.out.println("enter the second number :");
        b= reader.nextInt();
        Random random = new Random(a);
        int z = random.nextInt(b);
        System.out.println(z);
    }
}

