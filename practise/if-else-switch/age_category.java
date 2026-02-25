public class age_category {
    public static void main(String[] args) {
        int age = 349;
        if (age > 0 && age <= 13) {
            System.out.println("Child");
        } else if (age > 13 && age <= 19) {
            System.out.println("Teen");
        } else if (age > 19 && age < 60) {
            System.out.println("Adult");
        } else if (age >= 60) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid");   
        }
    }
}
