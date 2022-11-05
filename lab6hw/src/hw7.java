import java.util.Scanner;
public class hw7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int X;
        System.out.println("Enter an integer: ");
        X = reader.nextInt();
        System.out.println("The number in binary is: ");
        while (X > 0) {
            System.out.println(X % 2);
            X /= 2;
        }
    }
}
