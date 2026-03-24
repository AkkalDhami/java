public class Demo3 {
    public static void main(String[] args) {
        String s1 = new String(); // ? heap memory
        System.out.println(s1);

        String s2 = new String("Akkal Dhami"); // ? string pool & heap
        System.out.println(s2);

        String s3 = "Akkal Dhami"; // ? string pool
        String s4 = new String(s3); // ? heap
        System.out.println(s3 + " " + s4);

        // ? char arr
        char[] arr = { 'a', 'b', 'c' };
        // arr[0] = 'A';
        String s5 = new String(arr); // Abc
        // arr[0] = 'A';
        System.out.println(s5);// ? abc

        // ? char arr substring
        String s6 = new String(arr, 1, 2);
        System.out.println(s6); // ? bc

        //? byte arr
        byte[] arr2 = { 97, 98, 99 };
        String s7 = new String(arr2);
        System.out.println(s7); // ? abc => 97:a, 98:b, 99:c

        // ? byte arr substring
        String s8 = new String(arr2, 1, 2);
        System.out.println(s8);

        //? StringBuffer
        StringBuffer sb = new StringBuffer("Akkal Dhami");
        System.out.println(sb);

        //? StringBuilder
        StringBuilder sb2 = new StringBuilder("Akkal Dhami");
        System.out.println(sb2);
    }
}

// ? [0, 6) -> 0, 1, 2, 3, 4, 5