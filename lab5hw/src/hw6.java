public class hw6 {
    private int rate , balance ;

    public hw6(int rate, int balance) {
        this.rate = rate;
        this.balance = balance;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAddInterest(){
        rate=balance+rate;
        return getAddInterest();

            }




}
