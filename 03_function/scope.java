public class scope {
  static String name = "Akkal"; //? global variable
    public static void main(String[] args) {
        int x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println(y);
        }
        // ! System.out.println(y);
        System.out.println(name);
    }

    static void func() {
        // ! System.out.println(x, y);
        System.out.println(name);
    }
}
