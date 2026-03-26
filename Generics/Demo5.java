public class Demo5 {
    public static void main(String[] args) {
        Integer result = getResult(10);;
        System.out.println(result);

        String result1 = getResult("Akkal Dhami");
        System.out.println(result1);

        //? type inference
        printPair(12, "Dhami");
        printPair(10, "Akkal");
    }

    public static <T> T getResult(T a) {
        return a;
    }

    public static <T, U> void printPair(T a, U b) {
        System.out.println(a + "-" + b);
    }
}
// ? generic methods
