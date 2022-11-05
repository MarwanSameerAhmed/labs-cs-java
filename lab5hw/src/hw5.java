public class hw5 {
    private double balance , interest;

    public hw5(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
    public double getBalance() {
        return balance;
    }

    public void setdeposit(int amount){
        balance=balance+amount;
    }
    public void setwithdrawal(double amount){
        this.balance=this.balance-amount;
    }
    public void display(){
        System.out.println(getBalance());
    }
    public void addInterest(){
        balance=balance+(balance*(interest/100.0));

    }
}
