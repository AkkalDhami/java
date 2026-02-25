public class grade_calculator {
    public static void main(String[] args) {
        /*
         * Input marks (0–100). Print grade:
         * 
         * - 90–100 → A
         * - 80–89 → B
         * - 70–79 → C
         * - 60–69 → D
         * - Below 60 → F
         * 
         */

        float marks = 75;

        if (marks > 90 && marks <= 100) {
            System.out.println("Your grade is A.");
        } else if(marks > 80 && marks <= 90){
            System.out.println("Your grade is B.");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("Your grade is C.");
        } else if (marks >= 60 && marks <= 70) {
            System.out.println("Your grade is D.");
        } else if (marks < 60) {
            System.out.println("Your grade is F.");
        } else {
            System.out.println("Invalid marks");
        }
    }
}
