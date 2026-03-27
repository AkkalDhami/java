import java.util.ArrayList;
import java.util.List;

//? wildcard with upper bound

public class Demo3 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        print(dogs);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        print(animals);
    }

    static void print(List<? extends Animal> values) {
        for (Animal a : values) {
            a.eat();
            a.sleep();
        }

        // values.add(new Dog); //!
    }
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
    @Override
    void eat() {
        System.out.println("Dog Eating...");
    }
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat Eating...");
    }
}