public class Demo {
    public static void main(String[] args) {
        //? Autoboxing
        int x = 10;
        Integer y = x;

        System.out.println(x);
        System.out.println(y); //? unboxing

        //? Unboxing
        Integer z = 20;
        int w = z;

        System.out.println(z);
        System.out.println(w);

        int sum = x + y;
        System.out.println(sum);
        print(z);

    }
    
    static void print(Integer x) {
        System.out.println(x);
    }
}

/*
* Assignments
* Method calls
* Arithematic operations
*/