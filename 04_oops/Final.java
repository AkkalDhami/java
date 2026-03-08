public class Final {
    public static void main(String[] args) {
        final float PI = 3.14f; // ? final-> constant
        // ! x = 20;
        System.out.println(PI);

        Random r1 = new Random();
        //! r1.num = 10;
        System.out.println(r1.num + r1.x);

        print(5);

    }
    
    static void print(int x) {
        System.out.println(x);
    }
}

class Random {
    final int x = 50;

    final int num;

    static final double PI = 3.14; 

    Random() {
        this.num = 10;
    }
}