public class Static {
    public static void main(String[] args) {
        // ?
        /**
         ** One static method can only call other static methods
         ** Static method can only access static variables
         ** Doesnot have access to 'this' keyword
         */

        Student s1 = new Student("Aavash Dhami", 5);
        // Student.rollNum = 12;
        System.out.println("Name: " + s1.name + ", Roll No: " + Student.rollNum + ", Grade: " + Student.grade);

        Student s2 = new Student("Akkal Dhami", 5);
        System.out.println("Name: " + s2.name + ", Roll No: " + Student.rollNum);

        Student.printInfo(s1);
    }
}

class Student {
    String name;
    static int rollNum;
    static int grade = 5;

    
    Student(String name, int rollNum) {
        this.name = name;
    }
    
    static void printInfo(Student s1) {
        System.out.println("Name: " + s1.name + ", Roll No: " + rollNum);
    }

    //? static block: to initialize static variables
    static {
        rollNum = 12;
    }

}