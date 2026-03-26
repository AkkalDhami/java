public class Demo {
 public static void main(String[] args) {
     //? upcasting
     String s = "Hello World";
     Object o = s;
     System.out.println(o);

     //? downcasting
     Object o1 = "Hello World";
     String s1 = (String) o1;
     System.out.println(s1);
 }   
}
