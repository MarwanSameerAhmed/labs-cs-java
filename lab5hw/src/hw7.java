public class hw7 {
        private double Balance, Transaction = 0, Deduction = 0;

        public void TransRate() {
            Transaction++;
            if (Transaction > 5) Deduction++;
        }

        public double IncludeDeduction() {
            Balance -= Deduction;
            return Balance;
        }

        public void deposit(double X) {
            Balance = Balance + X;
            TransRate();
        }

        public void withDraw(double X) {
            if (Balance >= X) Balance -= X;
            else System.out.println("Not Enough Balance.");
            TransRate();
        }

        public double getBalance() {
            return Balance;
        }

    }

