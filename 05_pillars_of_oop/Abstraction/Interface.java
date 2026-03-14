public class Interface {
    public static void main(String[] args) {
        Car c1 = new FuelCar();
        c1.start();
        c1.stop();

        Car c2 = new ElectricCar();
        c2.start();
        c2.stop();
    }
}

interface Car {
    void start();

    void stop();
}

class FuelCar implements Car {
    public void start() {
        System.out.println("Fuel Car started!");
    }

    public void stop() {
        System.out.println("Fuel Car stopped!");
    }
}

class ElectricCar implements Car {
    public void start() {
        System.out.println("Electric Car started!");
    }

    public void stop() {
        System.out.println("Electric Car stopped!");
    }
}