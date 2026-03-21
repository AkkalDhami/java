public class Demo6 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();

        Vechile.brake();

    }
}

// ? Java-8 features
// * default method
// * static method

// ? Java-9 features
// * private method

interface Vechile {
    default void start() {
        engine();
        System.out.println("Vechile started!");
    }

    void stop();

    static void brake() {
        System.out.println("Vechile applied brake!");
    }

    private void engine() {
        System.out.println("Vechile engine started!");
    }
}

class Car implements Vechile {
    // public void start() {
    // System.out.println("Car started!");
    // }

    public void stop() {
        System.out.println("Car stopped!");
    }
}