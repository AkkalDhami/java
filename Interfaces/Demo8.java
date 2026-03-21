public class Demo8 {
    public static void main(String[] args) {
        C c = new C();
        c.print();
    }
}

// * java resolution priority rule

interface A {
    default void print() {
        System.out.println("A");
    }
}

class B {
    public void print() {
        System.out.println("B");
    }
}

class C extends B implements A {

}

// ? Interview question

/**
 * ? INTERFACE:
 ** - contract, blueprint
 ** - roles, responsibilities
 ** - Runnable, Payable
 ** - can do relationship
 ** 
 ** - normal fields: ❌
 ** - constructor: ❌
 ** - multiple inheritance: ✅
 ** - methods: public(by default)
 * 
 * ? ABSTRACT CLASS:
 ** - families of similar class
 ** - is a relationship
 ** 
 ** - normal fields: ✅
 ** - constructor: ✅
 ** - multiple inheritance: ❌
 ** - methods: any(public, protected, default, private)
 * 
 */

// ? Functional Interface: functional programming using lambda expression
interface X {
    void print();
}

class Y implements X {
    @Override
    public void print() {
        System.out.println("Y");
    }
}

//? Marker interface: no methods
//* - Cloneable, Serializable, RandomAccess
interface Z {}