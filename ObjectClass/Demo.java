import java.util.Objects;
import java.lang.Object;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("Akkal", 23);
        System.out.println(s1.toString());

        Student s2 = new Student("Akkal", 23);
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode() == s2.hashCode());

        System.out.println(s1.getClass().getName()); // ? Student
        System.out.println(s2 instanceof Object);// ? true

        Student s3 = (Student) s1.clone();
        System.out.println(s3);

    }
}

// ? instance of operator: checks if an object is an instance of a class
// ? clone: returns a copy of an object
// ? getClass(): return runtime class of an object

// * Not every object should be cloneable

class Student extends Object implements Cloneable {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return (name) + " " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        Student s1 = (Student) obj;
        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        return this.name.equals(s1.name) && this.age == s1.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override // ? shallow copy
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // @Override //? deprecated
    // protected void finalize() throws Throwable {
    // super.finalize();
    // }

}