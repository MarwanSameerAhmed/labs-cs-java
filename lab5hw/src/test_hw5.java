public class test_hw5 {
    public static void main(String[] args) {
        hw5 test5 = new hw5(1000,10);
        System.out.println("excepted answer is 1000");
        test5.display();
        System.out.println("--------------------------------");
        test5.addInterest();
        System.out.println("excepted answer is 1100");
        test5.display();
        System.out.println("--------------------------------------");
        test5.setwithdrawal(1100);
        System.out.println("excepted answer is 0.0");
        test5.display();
    }
}
