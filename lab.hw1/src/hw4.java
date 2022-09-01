import java.util.Scanner;

public class hw4 {
    static Scanner reader=new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("enter your money : ");
        double a = Double.parseDouble(reader.next());
        a += 5.0/100 * a;
        System.out.println("result for the first years : "+a);
        a += 5.0/100 * a;
        System.out.println("result for the second years : "+a);
        a += 5.0/100 * a;
        System.out.println("result for the third years : "+a);

    }
}
