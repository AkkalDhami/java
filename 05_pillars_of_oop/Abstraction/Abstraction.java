
public class Abstraction {
    /*
    ? Abstraction: The process of hiding the internal details and showing only the necessary information to the user.
    ? Abstraction is achieved by using abstract classes and interfaces.
    */
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.stop();

        FuelCar c2 = new FuelCar();
        c2.start();
        c2.stop();
    }
}

class Car {
    void start() {
        System.out.println("Car started!");
    }

    void stop() {
        System.out.println("Car stopped!");
    }
}

class FuelCar extends Car {
    void start() {
        System.out.println("Fuel Car started!");
    }
}

class ElectricCar extends Car {
    void start() {
        System.out.println("Electric Car started!");
    }
}