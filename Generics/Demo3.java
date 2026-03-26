public class Demo3 {
    public static void main(String[] args) {
        Box<String> b1 = new Box<String>("Akkal Dhami"); // ? type argument
        Box<Integer> b2 = new Box<Integer>(100);
        Box<Boolean> b3 = new Box<Boolean>(true);

        System.out.println(b1.getValue());
        System.out.println(b2.getValue() + 12);
        System.out.println(b3.getValue());

    }
}

// ? Generics

class Box<T> { // ? type parameter
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}