public class Demo5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Akkal Dhami");

        // ? append
        sb.append(" Aavash Dhami");
        System.out.println(sb);

        // ? insert
        sb.insert(2, " Aavash Dhami ");
        System.out.println(sb);

        // ? delete
        StringBuilder sb2 = new StringBuilder("Akkal");
        sb2.delete(2, 4); // ? 4 not included
        System.out.println(sb2); // ? Akl

        //? deleteCharAt
        StringBuilder sb3 = new StringBuilder("Akkal");
        sb3.deleteCharAt(2); // ? Akal
        System.out.println(sb3);

        // ? replace
        StringBuilder sb4 = new StringBuilder("Akkal");
        sb4.replace(0, 5, "Aavash"); // ? Aavash
        System.out.println(sb4);

        // ? reverse
        StringBuilder sb5 = new StringBuilder("Akkal");
        sb5.reverse(); // ? lKkaA
        System.out.println(sb5);

        // ? setCharAt
        StringBuilder sb6 = new StringBuilder("Akkal");
        sb6.setCharAt(2, 'A'); // ? AkAal
        System.out.println(sb6);

        //? length
        StringBuilder sb7 = new StringBuilder("Akkal");
        System.out.println(sb7.length()); //? 5

        //? capacity
        StringBuilder sb8 = new StringBuilder("Akkal");
        System.out.println(sb8.capacity()); //? 16 + 5: 21

        //? ensureCapacity
        StringBuilder sb9 = new StringBuilder(100);
        sb9.ensureCapacity(100); //? 100
        System.out.println(sb9.capacity());

        //? trimToSize
        StringBuilder sb10 = new StringBuilder("akkal");
        sb10.trimToSize();
        System.out.println(sb10.capacity()); //? 5
    }
}
//? StringBuffer
//? mutablity, thread safe

//? StringBuilder
//? mutablity, not thread safe