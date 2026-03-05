public class intro {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Akkal Dhami";
        s1.rollNum = 3;

        s1.printName();
    }

   static class Student {
        String name;
        int rollNum;

        void printName() {
            System.out.println(name);
        }
    }
}
