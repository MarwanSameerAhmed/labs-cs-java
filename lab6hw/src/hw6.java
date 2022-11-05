public class hw6 {
        public static void main(String[] args) {
            int X = 1;
            for (int i = 0; i <= 21; i++)
            {
                for (int r=0;r<i;r++)
                {
                    X*=2;
                }
                System.out.println(X);
                X=1;
            }
        }
}
