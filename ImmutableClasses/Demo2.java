public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("Akkal", new College("ABC", "XYZ"));

        Student s2 = new Student("Akkal", new College("ABC", "XYZ"));

        s1.getCollege().name = "CDE"; //! not changed

        System.out.println(s1.getName() + " " + s1.getCollege().name); //? Akkal ABC

    }
}

//? Immutable
//? defensive copy of college (non-primitive data type)
final class Student {
    private final String name;
    private final College college;

    Student(String name, College college) {
        this.name = name;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        return new College(this.college.name, this.college.address);
    }
}

class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}