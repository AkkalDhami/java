public class Demo5 {
    public static void main(String[] args) {
        MyDog d = new MyDog();
        d.bark();
        d.eat();
    }
}

//? Interface inheritance: extends, (interface->class: implements)

interface Animal{
    void eat();
}

interface Dog extends Animal{
    void bark();
}

class MyDog implements Dog {
    @Override
    public void bark() {
        System.out.println("barking...");
    }
    @Override
    public void eat(){
        System.out.println("eating...");
    }
}