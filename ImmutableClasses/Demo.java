public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Akkal", new College("ABC", "XYZ"));

        Student s2 = new Student("Akkal", new College("ABC", "XYZ"));

        //? shallow copy
        s1.getCollege().name = "CDE"; //? changed college name

        System.out.println(s1.getName() + " " + s1.getCollege().name); //? Akkal CDE

    }
}

//? Immutable
final class Student {
    private final String name;
    private final College college;

    Student(String name, College college) {
        this.name = name;
        this.college = college;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        return this.college;
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