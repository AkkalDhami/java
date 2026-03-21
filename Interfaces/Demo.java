public class Demo {
    public static void main(String[] args) {
        Thar t = new BlackThar();
        t.start();
        t.stop();
    }
}

interface Car {
    void start();

    void stop();
}

abstract class Thar implements Car {
    abstract public void start();

    @Override
    public void stop() {
        System.out.println("Thar stopped!");
    }
}

class BlackThar extends Thar {
    @Override
    public void start() {
        System.out.println("Black Thar started!");
    }
}