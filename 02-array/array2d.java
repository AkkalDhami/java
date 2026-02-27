
public class array2d {
    public static void main(String[] args) {
        // ? 2D array
        // int r = 3, c = 3;
        // int marks[][] = new int[r][c];
        // marks[0][0] = 10;
        // marks[0][1] = 20;
        // marks[0][2] = 30;
        // marks[1][0] = 40;
        // marks[1][1] = 50;
        // marks[1][2] = 60;
        // marks[2][0] = 70;
        // marks[2][1] = 80;
        // marks[2][2] = 90;

        int marks[][] = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }

        int arr[][] = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[3];
        arr[2] = new int[4];

        arr[0][0] = 10;
        arr[1][0] = 20;
        arr[1][1] = 30;
        arr[1][2] = 40;
        arr[2][0] = 50;
        arr[2][1] = 60;
        arr[2][2] = 70;
        arr[2][3] = 80;

        /*
         * 10
         * 20 30 40
         * 50 60 70 80
         */

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
