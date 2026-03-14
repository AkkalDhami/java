public class Demo2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner in = outer.new Inner();
        in.print();

        Outer.Inner in2 = new Outer().new Inner();
        in2.print();
        in2.fun();

        Outer.Inner.fun();  
    }
}

//? Inner class
class Outer {
    int x = 10;

    class Inner {
        int x = 20;
        static void fun() {
            System.out.println("fun");
        }
        void print() {
            System.out.println("x: " + this.x); //? 20
            System.out.println("x: " + Outer.this.x); //? 10
        }
    }
}