public class Demo5 {
    public static void main(String[] args) {
        Box<String> b1 = new Box<String>("Akkal Dhami");
    }

    public static <T> void fun(T a, T b) { // ? type parameter

    }
}

class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }
}

/**
 * if no bound -> replace with Object
 * if bounded -> replace with bound
 * insert cast automatically
 */