public record simple_calculator_I() {
    public static void main(String[] args) {
        int x = 4, y = 2;
        char op = '/';

        if (op == '+') {
            System.out.println("Sum: " + (x + y));
        } else if (op == '-') {
            System.out.println("Difference: " + (x - y));
        } else if (op == '*') {
            System.out.println("Product: " + (x * y));
        } else if (op == '/') {
            if(y != 0){
                System.out.println("Difference: " + (x / y));
            } else {
                System.out.println("Difference: 0");
            }
        }
    }
}
