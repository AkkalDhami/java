public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo();

        Student s2 = new Student("Ram", 3);
        s2.printInfo();

        Student s3 = new Student("Shyam");
        s3.printInfo();
    }
}

class Student {
    String name;
    int rollNum;

    Student(String name) {
        this(name, 0);
    }

    //? default constructor
    Student() {
        name = "Akkal Dhami";
        rollNum = 3;
    }

    //? parameterized constructor
    Student(String name, int rollNum) {
        this.name = name;
        this.rollNum = rollNum;
    }

    void printInfo() {
        System.out.println( "Name: " + name + ", Roll No: " + rollNum);
    }
}