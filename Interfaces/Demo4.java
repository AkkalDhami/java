public class Demo4 {
    public static void main(String[] args) {
        C c = new C();
        c.print();
        c.print2();
    }
}

//? Multiple Inheritance

interface A {
    void print();
}

interface B {
    default void print2() {
        System.out.println("B");
    }
}

class C implements A, B {
    @Override
    public void print() {
        System.out.println("A");
    }

    @Override
    public void print2() {
        System.out.println("D");
    }
}

