public class Demo3 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.fun();
    }
}

// ? Local class: {class}
class Outer {
    void fun() {
        int y = 5;
        // ! y++;
        class Local {
            void print() {
                System.out.println("local class");
                System.out.println(y);
            }
        }
        Local l = new Local();
        l.print();
    }
}