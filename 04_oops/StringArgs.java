public class StringArgs {
    public static void main(String[] args) {

        //? java StringArgs "Akkal" "Dhami" "Aavash"

        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}
