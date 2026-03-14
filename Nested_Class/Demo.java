public class Demo {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner in = new Outer.Inner(o); // ? without creating outer class
        in.print();
        in.printX();
    }
}

class Outer {
    private static int x = 7;

    void fun() {
    };

    static class Inner extends Demo {
        Outer outer;
        static int y = 8;

        static void fun() {
        }

        Inner(Outer o) {
            this.outer = o;
        }

        void print() {
            System.out.println("inner class");
        }

        void printX() {
            System.out.println("x: " + this.outer.x);
        }
    }
}

class BankAccount {

   private static class InterestCalculator {
        static double calculateYearlyInterest(double principal, double rate) {
            return principal * rate;
        }

        // static double calculateMonthlyInterest(double principal, double rate) {
        //     return principal * rate / 12;
        // }

        //? USE CASES OF STATIC NESTED CLASSES:
        //? As helper class of any outer class
        //? Builder design pattern
        //? Req/Res DTO
    }

    public double computeInterest() {
        return InterestCalculator.calculateYearlyInterest(100, 4);
    }
}

/*
 * Logical grouping
 * Better access to outer class
 */

/*
 * ? Properties of inner class
 * cannot access static variables, methods
 */