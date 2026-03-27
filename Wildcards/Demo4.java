import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        print(animals);
    }

    static void print(List<? super Animal> values) {
        // ? writing
        values.add(new Animal());
        values.add(new Dog());
        values.add(new GermanShepherd());
        values.add(new Cat());

        // ? reading
        for (java.lang.Object obj : values) {
            Animal a = (Animal) obj;
            a.eat();
        }
    }
}

// ? generics with lower bound (super)
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

class GermanShepherd extends Dog {
    @Override
    void eat() {
        System.out.println("German Shepherd Eating...");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat Eating...");
    }
}

/*
 * List <? extends T> -> reading(covariant)
 * List <? super T> -> writing(countravariant)
 * List <T> -> invariant
 * 
 * PECS rule: Producer Extends Consumer Super
 */