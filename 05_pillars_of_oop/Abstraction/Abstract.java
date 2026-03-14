
public class Abstract {
    public static void main(String[] args) {
        
        Car c1 = new FuelCar();
        c1.start();
        c1.stop();

        Car c2 = new ElectricCar();
        c2.start();
        c2.stop();
    }   
}

abstract class Car {
    abstract void start();
    abstract void stop();
}

class FuelCar extends Car {
    @Override
    void start() {
        System.out.println("Fuel Car started!");
    }
    
    @Override
    void stop() {
        System.out.println("Fuel Car stopped!");
    }
}

class ElectricCar extends Car {
    @Override
    void start() {
        System.out.println("Electric Car started!");
    }
    
    @Override
    void stop() {
        System.out.println("Electric Car stopped!");
    }
}