import java.util.Scanner;
import java.lang.String;
public class hw4 {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            String X;
            System.out.println("Write a word: ");
            X=reader.next();
            for (int i = 0; i < X.length(); i++) {
                System.out.println(X.charAt(i));
            }
        }
    }


