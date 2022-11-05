import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {

                double balance , interest ;
                int year = 0;
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter balance: ");
                balance=reader.nextDouble();
                System.out.println("Enter interest: ");
                interest=reader.nextDouble();
                double X = balance;
                while(X < 1000000)
                {
                    X+=balance*(interest/100);
                    year++;
                }
                System.out.println("It takes "+year+" years to reach 1000000");
            }
        }


