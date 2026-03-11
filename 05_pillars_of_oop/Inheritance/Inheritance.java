public class Inheritance {
    /* 
    ? Inheritance: A class that inherits from another class
    ? Types of Inheritance
    * 1. Simple Inheritance:
    *     = A -> B
    
    * 2. Multi-level Inheritance:
    *     = A -> B -> C
    
    * 3. Hierarchical Inheritance:
    *     = A -> B
    *     = A -> C
    
    * 4. Multiple Inheritance(not supported in java):
    *     A  B
    *     \ /
    *      C
   
    ? Why multiple inheritance is not supported in java?
    * Ans: due to diamond problem
    * 
    *        A
    *      /  \
    *     B   C
    *     \   /
    *       D
    */

    public static void main(String[] args) {
        CsStudent s1 = new CsStudent("Akkal");
        s1.markAttendance();
        s1.submitAssignment();
    }
}


//? parent class
class Student {
    String name = "Akkal Dhami";

    Student(String name) {
        this.name = name;
    }

    protected void markAttendance() {
        System.out.println("Marking Attendance: " + name);
    }
}

//? 1. simple inheritance
class CsStudent extends Student {

    CsStudent(String name) {
        super(name); //? super(): access parent class constructor
    }

    public void submitAssignment() {
        System.out.println("Submitting Assignment: " + name);
    }
}


//? 2. multi-level inheritance
class BtechStudent extends CsStudent {
    BtechStudent(String name) {
        super(name);
    }

    public void submitProject() {
        System.out.println("Submitting Project: " + name);
    }
}

//? 3. hierarchical inheritance
class MedicalStudent extends Student {
    MedicalStudent(String name) {
        super(name);
    }

    public void submitReport() {
        System.out.println("Submitting Report: " + name);
    }
}