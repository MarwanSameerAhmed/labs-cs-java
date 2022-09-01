import java.util.Scanner;

public class hw2 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        int a =0 ;
        System.out.println("enter the number : ");
        a=reader.nextInt();
        if(a%2==0) {
            System.out.printf("the number is even ");
        }
 if (a==0) {
     System.out.printf(", cuz The zero is counted among the even number");
 }
          else {
                System.out.println("the number is odd ");
            }
        }

}