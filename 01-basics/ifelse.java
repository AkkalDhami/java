public class ifelse {
    public static void main(String[] args) {
        int number = 10;

        // * if statement
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        }

        // * if-else statement
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // * if-else-if ladder
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println(number + " is zero.");
        }
    }
}
