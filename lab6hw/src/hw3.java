import java.util.Scanner;
public class hw3 {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int Y;
            double X , Z , W;
            do
            {
                System.out.println("Enter (1) to Continue.\nor (2) to Exit.");
                Y=reader.nextInt();
                if (Y==1)
                {
                    System.out.println("Write the price of 1$ in japanese yen: ");
                    X=reader.nextDouble();
                    System.out.println("1- Enter price in dollar to convert into yen");
                    Z= reader.nextDouble();
                    W=X*Z;
                    System.out.println(Z+"$ in yen = "+W+"\n\n");
                    Z=0;
                    X=0;
                }
                else break;
            }while (true);

        }
    }

