public class intro {
    public static void main(String[] args) {
        sayHello();
        sayHello2("Akkal");
        System.out.println("Sum : " + add(1, 2));
        System.out.println("Sum : " + add(1, 2, 3));
    }

    static void sayHello() {
        System.out.println("Hello Akkal!");
    }

    static void sayHello2(String name) {
        System.out.println("Hello " + name + "!");
    }

    static int add(int a, int b) {
        return (int) a + b;
    }

    static int add(double a, double b, double c){
        return (int) (a + b + c);
    }
}
