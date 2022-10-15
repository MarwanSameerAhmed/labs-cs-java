import java.util.ArrayList;

public class User extends Data {
    private ArrayList<Item> users;
    private static Item user;
    public User() {
        super(USER_CLASS);
        users = new ArrayList<>(super.users());
    }

    public User(int userId) {
        super(USER_CLASS);
        this.users = new ArrayList<>(super.users());
        for (Item u : this.users){
            if (u.userId == userId){
                this.user = u;
                break;
            }
        }
    }

    public User(int userId, ArrayList<Item> users){
        super(USER_CLASS);
        this.users = users;
        for (Item u : this.users){
            if (u.userId == userId){
                this.user = u;
                break;
            }
        }
    }

    public ArrayList<Item> getUsers() {
        return new ArrayList<>(this.users);
    }

    public Item getUser() {
        if (user == null)
            throw new IllegalArgumentException("لايوجد بيانات");
        return user;
    }
  

    public void setName(String name) {
        if (user == null)
            throw new IllegalArgumentException("لايوجد بيانات");
        this.user.name = name;
        super.update(this.user);
    }

 

    public void deposit(double amount) {
        if (user == null)
            throw new IllegalArgumentException("لايوجد بيانات");
        this.user.balance += amount;
        super.update(this.user);
    }

    public void withdraw(double amount) {
        if (user == null)
            throw new IllegalArgumentException("لايوجد بيانات");
        this.user.balance -= amount;
        super.update(this.user);
    }
    public void checkUsername(){
        
    }
    private void editUser(Item user){
        
        super.update(user);
    }

    public void newUser(Item user) {
        super.insert(user);
    }

    public void deleteUser(Item user) {
        super.delete(user);
    }

    public void refresh(){
        this.users = new ArrayList<>(super.users());
    }

    public static class Item {

        private int userId;
        private String name;
        private String username;
        private String password;
        private int access;
        private double balance;
        private String phoneNumber;
        private boolean enabled;

        public Item(int userId, String name, String username, String password, int access, double balance, String phoneNumber, boolean enabled) {
            this.userId = userId;
            this.name = name;
            this.username = username;
            this.password = password;
            this.access = access;
            this.balance = balance;
            this.phoneNumber = phoneNumber;
            this.enabled = enabled;
        }
        
        public int getUserId() {
            if (user == null)
                throw new IllegalArgumentException("مابش ييلتلا");
            return user.userId;
        }

        public String getName() {
            if (user == null)
                throw new IllegalArgumentException("مابش ييلتلا");
            return user.name;
        }

        public String getUsername() {
            if (user == null)
                throw new IllegalArgumentException("مابش ييلتلا");
            return user.username;
        }

        public String getPassword() {
            if (user == null)
                throw new IllegalArgumentException("مابش ييلتلا");
            return user.password;
        }

        public int getAccess() {
            if (user == null)
                throw new IllegalArgumentException("مابش ييلتلا");
            return user.access;
        }

        public double getBalance() {
            if (user == null)
                throw new IllegalArgumentException("مابش ييلتلا");
            return user.balance;
        }

        public String getPhoneNumber() {
            if (user == null)
                throw new IllegalArgumentException("مابش ييلتلا");
            return user.phoneNumber;
        }

        public boolean getEnabled() {
            if (user == null)
                throw new IllegalArgumentException("مابش ييلتلا");
            return user.enabled;
        }
        public void setPassword(String password) {
            if (user == null)
                throw new IllegalArgumentException("لايوجد بيانات");
            this.password = password;
            User u = new User();
            u.editUser(this);

        }

        public void setAccess(int access) {
            if (user == null)
                throw new IllegalArgumentException("لايوجد بيانات");
            this.access = access;
            User u = new User();
            u.editUser(this);
        }


        public void setPhoneNumber(String phoneNumber) {
            if (user == null)
                throw new IllegalArgumentException("لايوجد بيانات");
            this.phoneNumber = phoneNumber;
            User u = new User();
            u.editUser(this);
        }

        public void setEnabled(boolean enabled) {
            if (user == null)
                throw new IllegalArgumentException("لايوجد بيانات");
            this.enabled = enabled;
            User u = new User();
            u.editUser(this);
        }


    }
    
}







