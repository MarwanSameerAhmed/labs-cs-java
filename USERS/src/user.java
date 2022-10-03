import java.util.ArrayList;

public class user {

    public class Item {

        public  int userId;
        public String name;
        public String username;
        public String password;
        public int access ;
        public double balance;
        public String phoneNumber;
        public boolean enabled;




        public Item(int userId,
                    String name,
                    String username,
                    String password,
                    int access,
                    double balance,
                    String phoneNumber,
                    boolean enabled) {
            this.userId = userId;
            this.name = name;
            this.username = username;
            this.password = password;
            this.access = access;
            this.balance = balance;
            this.phoneNumber = phoneNumber;
            this.enabled = enabled;
        }
         
      private ArrayList<Item>theUser;
        private Item user ;

        public void user(){
            return;
}


        public Item getUser() {
            return user;
        }

        public int getUserId() {
            return userId;
        }

        public String getName() {
            return name;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public int getAccess() {
            return access;
        }

        public double getBalance() {
            return balance;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
        public boolean getEnabled(){
            return enabled;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setAccess(int access) {
            this.access = access;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }
        public void deposit(){

        }
        public void withdraw(){

        }
        public void newUser(){

        }
        public void deleteUser(){

        }
    }

    }







