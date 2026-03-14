public class Interview {
    public static void main(String[] args) {
        //!ERROR Animal a = new Animal();
        Dog d = new Dog("x-dog");
        d.makeSound();
        d.eat();

        d.printName(d);
    }
}

abstract class Animal {
    abstract void makeSound();

    String name;

    Animal(String name) {
        this.name = name;
    }

   final public void eat() {
        System.out.println("Eating...");
    }

    static void printName(Animal a) {
        System.out.println(a.name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Barking...");
    }
}

/* 
? Abstract class: 
* - cannot be instantiated.
* - can contain abstract methods(methods without implementation).
* - can also contain normal methods.
* - it is meant to be extended.
*/

/*
 * ? Interview Questions:
 * 
 * 1. Can abstract class have constructor? => Yes
 * 2. Can abstract class be final? => No
 * 3. Can abstract class have static methods/variables? => Yes
 * 4. Can abstract class have private methods? => Yes but non abstract
 * 5. Can abstract class have final methods? => Yes but non abstract
 * 6. Can abstract class have no abstract methods? => Yes
 */