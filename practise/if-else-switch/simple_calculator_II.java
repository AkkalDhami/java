public class simple_calculator_II {
    public static void main(String[] args) {
        int x = 4, y = 0;
        char op = '=';

        switch (op) {
            case '+':
                System.out.println("Sum: " + (x + y));
                break;
            case '-':
                System.out.println("Difference: " + (x - y));
                break;
            case '*':
                System.out.println("Product: " + (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.println("Division: " + (x / y));
                } else {
                    System.out.println("Division: 0");
                }
                break;
        
            default:
                System.out.println("Invalid operator!");
        }
    }
}
