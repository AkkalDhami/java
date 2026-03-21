public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.VALUE);

        Random r = new Random();
        r.fun();

        Math m = new Random();
        m.fun();
    }
}

// ? variables inside interface

interface Math {
    public static final double PI = 3.14;
    int VALUE = 10; //? automatically static final

    void fun();
}

class Random implements Math {
    @Override
    public void fun() {
        System.out.println(PI);
    }
}