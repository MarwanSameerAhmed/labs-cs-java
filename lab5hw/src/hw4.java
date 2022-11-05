public class hw4 {
    private double balance , interest;

    public hw4(double balance) {
        this.balance = 0;

    }



    public double getBalance() {
        return balance;
    }

    public void setdeposit(int amount){
        balance=balance+amount;
    }
    public void setwithdrawal(double amount){
        balance=balance-amount;
    }
    public void display(){
        System.out.println(getBalance());
    }
    public void addInterest(double interest){
        balance=balance+(balance*(interest/100.0));

    }

    }

