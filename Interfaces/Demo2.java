public class Demo2 {
    public static void main(String[] args) {
        Payment payment = new CreditCard();
        payment.pay();
    }
}

interface Payment {
    void pay();
}

//? polymorphism

class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Credit card payment done!");
    }
}

class DebitCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Debit card payment done!");
    }
}