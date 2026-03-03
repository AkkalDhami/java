public class chaining {
    public static void main(String[] args) {
        //? Chaining of functions
        func1();
    }

    static void func1() {
        func2();
        System.out.println("func1");
    }

    static void func2() {
        func3();
        System.out.println("func2");
    }

    static void func3() {
        System.out.println("func3");
    }
}
