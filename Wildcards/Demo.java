import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //? invariant in generics
        // Animal an = new Dog();
        // an.eat();
        // an.sleep();

        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs; //!error: cannot convert from List<Dog> to List<Animal>

        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;

        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();
        animals[4] = new Animal();
        
        
        for (Animal animal : animals) {
            if(animal == null) continue;
            animal.eat();
        }
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
    void bark() {
        System.out.println("Barking...");
    }
}