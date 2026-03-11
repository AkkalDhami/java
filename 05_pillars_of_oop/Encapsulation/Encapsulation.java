public class Encapsulation {

    /*
    ? Encapsulation:
    * Encapsulation is a process of wrapping data and methods into a single unit called class.
    * We should not access the data directly from outside the class.
    */

    //? Access modifiers:
    /*
    * public: accessible from anywhere
    * private: accessible from within the class
    * default: accessible from within the package
    * protected: accessible from within the class and its subclasses
    */

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        a1.deposit(1000);
        a1.withdraw(500);
        System.out.println(a1.getBalance());


        Student s1 = new Student();
        s1.setName("John");
        System.out.println(s1.getName());
    }
}

class BankAccount {
    private double balance;
    
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}

class Student {
    private String name;

    //? setters
    public void setName(String name) {
        this.name = name;
    }

    //? getters
    public String getName() {
        return name;
    }
}