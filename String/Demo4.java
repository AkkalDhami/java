public class Demo4 {
    public static void main(String[] args) {
        // ? String methods
        String s1 = "Akkal Dhami";
        String s2 = new String("");

        // ? length
        System.out.println(s1.length());// * 12

        // ? isEmpty
        System.out.println(s1.isEmpty()); // * false

        // ? isBlank: java-11
        System.out.println(s2.isBlank()); // * true, checks if string is empty or contains only spaces

        // ? charAt
        System.out.println(s1.charAt(0)); // * A

        // ? toCharArray
        char[] arr = s1.toCharArray();
        for (char c : arr) {
            System.out.print(c);
        }

        System.out.println();

        // ? equals
        System.out.println(s1.equals("Akkal Dhami")); // * true

        // ? equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("akkal dhami")); // * true

        // ? compareTo
        // * Lexicographical comparison
        System.out.println(s1.compareTo("Akkal")); // * 6
        System.out.println("A".compareTo("a")); // * -32: A=65, a=97

        // ? contains
        System.out.println("Akkal Dhami".contains("Dhami")); // * true

        //? indexOf
        System.out.println("Akkal Dhami".indexOf("Dhami")); // * 6
        System.out.println("ABC".indexOf('B')); // * 1

        // ? lastIndexOf
        System.out.println("Akkal Dhami".lastIndexOf("a")); // * 9

        // ? startsWith
        System.out.println("Akkal Dhami".startsWith("Akkal")); // * true

        // ? endsWith
        System.out.println("Akkal Dhami".endsWith("Dhami")); // * true

        // ? substring
        System.out.println(s1.substring(0, 5)); // * Akkal

        // ? toLowerCase
        System.out.println("Akkal Dhami".toLowerCase()); // * akkal dhami

        // ? toUpperCase
        System.out.println("Akkal Dhami".toUpperCase()); // * AKKAL DHAMI

        // ? trim
        System.out.println("   Akkal Dhami   ".trim()); // * Akkal Dhami

        //? strip
        System.out.println("   Akkal Dhami   ".strip()); // * Akkal Dhami

        //? repeat
        System.out.println("Akkal Dhami".repeat(2)); // * Akkal DhamiAkkal Dhami

        // ? replace
        System.out.println("Akkal Dhami".replace("Akkal", "Aavash")); // * Aavash Dhami

        // ? replaceAll
        System.out.println("Akkal Dhami Akkal".replaceAll("Akkal", "Aavash")); // * Aavash Dhami

        // ? split
        String str = "Akkal, Aavash";
        String[] arr2 = str.split(", "); // * ["Akkal", "Aavahsh"]
        for (String s : arr2) {
            System.out.println(s);
        }

        //? join
        String[] arr3 = { "Akkal", "Aavash" };
        System.out.println(String.join("-", arr3)); // * Akkal,Aavash

        // ? concat
        System.out.println("Akkal".concat(" Dhami")); // * Akkal Dhami

        // ? valueOf
        System.out.println(String.valueOf("asd")); // * asd

        //? getBytes
        byte[] arr4 = "Akkal Dhami".getBytes(); // * [65, 107, 107, 97, 108, 32, 68, 104, 97, 109, 105]
        for (byte b : arr4) {
            System.out.print(b + " "); // * 65 107 107 97 108 32 68 104 97 109 105
        }

        System.out.println();

        // ? intern 
        String s3 = new String("Akkal Dhami");
        String s4 = s3;
        System.out.println(s3 == s4); // * true
        String s5 = s3.intern();
        System.out.println(s3 == s5); // * false

        //? format
        System.out.println(String.format("%s %s %s", "Hello,", "Akkal", "Dhami")); // * Akkal Dhami
    }
}
