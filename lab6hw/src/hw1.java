import java.util.Scanner;
public class hw1 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int start;
        int end =0;
        System.out.println("enter your number for start :");
        start=reader.nextInt();
        System.out.println("enter your number for end :");
        end=reader.nextInt();
        int a = 0;
        for (int i  = 2; i <= end; i++) {
            if (i % 2 == 0) {
                a = a + i;
            }


        }
        System.out.println(a);

        System.out.println("----------------------------------");
        int start2;
        int end2;
        System.out.println("enter your number for start2 :");
        start2=reader.nextInt();
        System.out.println("enter your number for end2 :");
        end2=reader.nextInt();
        int b =0;
        for (int j = start2 ; j <= end2 ; j++) {
            if (j%2==1) {

                b= b+j;
            }




        }
        System.out.println(b);

    }
    }

