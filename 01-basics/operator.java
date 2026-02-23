public class operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // ? Arithmetic Operators
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // ? Increment and Decrement Operator
        int d = 5;
        System.out.println("d++: " + (d++)); // * Post-increment
        System.out.println("d: " + d); // d = 6
        System.out.println("++d: " + (++d)); // * Pre-increment
        System.out.println("d: " + d); // d= 7

        System.out.println("d--: " + (d--)); // * Post-decrement
        System.out.println("d: " + d); // d = 6
        System.out.println("--d: " + (--d)); // * Pre-decrement
        System.out.println("d: " + d); // d = 5

        int e = d++;
        System.out.println("e: " + e); // e = 5

        // ? Relational Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // ? Assignment Operators
        int c = 5;
        c += 10; // c = c + 10
        System.out.println("c after += 10: " + c);

        // ? Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        //? Bitwise Operators
        int p = 1, q = 2; // 1: 0001, 2: 0010
        int r = p & q;
        /*
            001
            010
           &----
            000 
            
         */

        System.out.println("p & q: " + r);

        byte m = 3;
        m = (byte) (m << 1); // 3: 011 , >>: 110 => 6
        m = (byte) (m << 1); // 6: 110 , >>: 1100 => 12
        m = (byte) (m << 1); // 6: 110 , >> => 24
        m = (byte) (m << 1); // 6: 110 , >> => 48
        m = (byte) (m << 1); // 6: 110 , >> => 96
        m = (byte) (m << 1); // 6: 110 , >>: 1100 => -64
        m = (byte) (m << 1); // 6: 110 , >>: 1100 => -128
        
        //? pattern: m * 2 
        System.out.println("m << 1: " + m); //? 12

    }
}
