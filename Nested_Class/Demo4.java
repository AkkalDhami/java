//? Anonymous class
public class Demo4 {
    public static void main(String[] args) {

        Person p = new Person();
        p.print();

        Guest g = new Guest();
        g.print();

        Person p2 = new Person() {
            @Override
            void print() {
                System.out.println("Guest!");
            }

            void print2() {
                System.out.println("Guest!");
            }
        };
        p2.print();
        //!ERROR: p2.print2();
    }
}

class Person {
    void print() {
        System.out.println("Hello");
    }
}

class Guest extends Person {
    @Override
    void print() {
        System.out.println("Guest");
    }
}