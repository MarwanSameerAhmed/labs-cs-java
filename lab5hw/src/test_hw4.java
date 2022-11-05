public class test_hw4 {
    public static void main(String[] args) {
        hw4 test4=new hw4(0);
        test4.setdeposit(1000);
        test4.addInterest(10);
        System.out.println("excepted answer 1100");
        test4.display();
    }
}
