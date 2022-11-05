import java.util.Scanner;
public class hw5 {
     public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            String X;
            System.out.println("Write a word: ");
            X = reader.next();
            for (int i = (X.length() - 1); i >= 0; i--) {
                System.out.print(X.charAt(i));
            }
        }
    }

