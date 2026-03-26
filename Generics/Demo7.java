public class Demo7 {
    public static void main(String[] args) {
        // Box<Dog> b1 = new Box<Dog>(); //! error

        Box<Fish> b2 = new Box<Fish>();
        b2.value.swim();
    }
}

class Box<T extends Animal & Swimmable> {
    T value;
}

interface Swimmable {
    void swim();
}

class Animal {
    void display() {
        System.out.println("Animal display()");
    }
}

class Dog extends Animal {
}

class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Swimming...");
    }
}

// ? <T extends Animal & I1, I2>