public class Demo2 {
 public static void main(String[] args) {
     String s1 = "Akkal Dhami";
     s1 = "Aavash Dhami";
     System.out.println(s1); //? Aavash Dhami
 }   
}

//? GOLDEN RULE:
//* Only compile time constants go to string pool automatically
//* Runtime constants go to heap