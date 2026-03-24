
public class Demo {
    public static void main(String[] args) {
        String s1 = "Akkal Dhami"; //? -> string pool
        String s2 = "Akkal Dhami";
        System.out.println(s1 == s2); //? true
        System.out.println(s1.equals(s2)); //? true
        System.out.println("s1: " + s1 + " s2: " + s2);

        String s3 = new String("Akkal Dhami"); //? -> heap
        System.out.println(s1 == s3); //? false
        System.out.println(s1.equals(s3)); //? true
        System.out.println("s1: " + s1 + " s3: " + s3);
    }

}