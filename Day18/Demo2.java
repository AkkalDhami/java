public class Demo2 {
    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;
        System.out.println(a == b); //? false

        System.out.println(a.equals(b)); //? true

        System.out.println(a.intValue() == b.intValue()); //? true
    }
}
