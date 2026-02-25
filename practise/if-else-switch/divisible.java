public class divisible {
    public static void main(String[] args) {
        //? Check whether a number is divisible by both 5 and 11.
        int num = 55;
        if(num % 5 == 0 && num % 11 == 0){
            System.out.println(num + " is divisible by both 5 and 11.");
        } else {
            System.out.println(num + " is not divisible by both 5 and 11.");
        }
    }
}
