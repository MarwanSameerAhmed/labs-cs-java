import java.util.Scanner;

public class hw1 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args){
                System.out.println(" for franch enter (10)");
                System.out.println(" for arabic enter (11)");
                System.out.println("for german enter (12)");
                System.out.print("write here your choice :");
                int a = reader.nextInt();
                switch (a) {
                    case 10:
                        System.out.println("Bienvenue dans notre système");

                        break;
                }

                switch (a) {
                    case 11:
                        System.out.println("اهلا بك");
                        break;
                }
                switch (a) {
                    case 12:
                        System.out.println("Willkommen in unserem System");
                        break;
                }
            }
        }


