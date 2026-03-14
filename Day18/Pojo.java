public class Pojo {
    //? Plain Old Java Object(POJO)
    //? have no harder business logic
    //* - aneimic model
    //* - rich domain model(has business logic)
    public static void main(String[] args) {
        Student s1 = new Student("Akkal");
        System.out.println(s1.getName());
    }
}

class Student {
    String name;

     Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}