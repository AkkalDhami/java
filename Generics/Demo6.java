public class Demo6 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>(2);
        b1.printDouble();

        // Box<String> b2 = new Box<String>("2.5"); //! error

    }
}

// ? bounds in generics

class Box<T extends Number> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public void printDouble() {
        System.out.println(value.doubleValue());
    }
}
