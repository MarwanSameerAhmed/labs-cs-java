public class test_hw3 {
    public static void main(String[] args) {
        hw3 test3 = new hw3(0);
        test3.setdeposit(1000);
        test3.setwithdrawal(500);
        test3.setwithdrawal(400);
        System.out.println("the expected answer is 100 ");
        test3.display();
    }
}
