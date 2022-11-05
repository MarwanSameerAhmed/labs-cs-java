public class hw3 {
 private double balance;

    public hw3(double balance) {
        this.balance = 0;

    }

    public double getBalance() {
        return balance;
    }

    public double setdeposit(int amount){
        balance=balance+amount;
        return this.balance;
    }
    public double setwithdrawal(double amount){
        balance=balance-amount;
        return this.balance;
    }
    public void display(){
        System.out.println(getBalance());
    }
}

