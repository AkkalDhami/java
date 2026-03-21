public class Demo7 {
    public static void main(String[] args) {
        D d = new D();
        d.print();
    }
}

interface A {
    void print();
}

interface B extends A {
    @Override
    default void print() {
        System.out.println("B");
    }
}

interface C extends A {
    @Override
    default void print() {
        System.out.println("C");
    }
}

class D implements B, C {
    @Override
    public void print() {
        B.super.print();
        C.super.print();
        System.out.println("D");
    }
}