
public class Polymorphism {
    //? Polymorphism: The process of having many forms
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.start("Push Button");
        car.start("Remote Start", 20);

        A a = new B();
        a.print(); //? => A (static method), B (overridden method)

        D d = new E();
        System.out.println(d.x); //? => 20,  not 30(variable of class E)
        System.out.println(d.getX()); //? => 30
    }
}

class Car {
    void start() {
        System.out.println("Car starts with key");
    }

    void start(String mode) {
        System.out.println("Car starts with " + mode);
    }

    void start(String mode, int temperature) {
        System.out.println("Car starts with " + mode + " at temperature " + temperature);
    }
}

//? Static method: The method is belongs to the class and not the object. Static method cannot override.

//? Private method: Private method cannot be overridden.

//? Final method: Final method cannot be overridden.

//? Final -> class: Final class cannot be inherited.

//? Fields/Variables: They cannot be polymorphic.

class A {
    static void print() {
        System.out.println("A");
    }
    
    // private void printPrivate() {
    //     System.out.println("Private");
    // }

    final void printFinal() {
        System.out.println("Final");
    }
}

class B extends A {
    static void print() {
        System.out.println("B");
    }
    
    void printPrivate() {
        System.out.println("Private");
    }

    // void printFinal() { //? Error: Final method cannot be overridden
    //     System.out.println("Final");
    // }
}

class D {
    int x = 20;

    int getX() {
        return x;
    }
}

class E extends D {
    int x = 30;

    int getX() {
        return x;
    }
}