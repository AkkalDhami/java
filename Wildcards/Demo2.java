import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
         List<Dog> dogs = new ArrayList<>();
         dogs.add(new Dog());
         dogs.add(new Dog());
         print2(dogs);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        print2(animals);

    }

    static void print2(List<?> values) {
        for (java.lang.Object obj : values) {
            System.out.println(obj.getClass().getName());
        }
    }
    
    // static void print(List<Animal> animals) {
    //     for (Animal animal : animals) {
    //         animal.eat();
    //     }
    // }
}

class Animal {
    void eat() {
        System.out.println("Eating...");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}