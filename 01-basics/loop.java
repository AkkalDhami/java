public class loop {
    public static void main(String[] args) {

        // * WHILE LOOP
        // ? infinite loop
        // while (true) {
        // System.out.println("Hello World!");
        // }

        int i = 0;
        while (i <= 10) {
            System.out.println("Hello World - " + (i + 1));
            i++;
        }

        // * DO-WHILE LOOP
        // ? it checks the condition at the end
        int j = 0;
        do {
            System.out.println("Hello World - " + (j + 1));
            j++;
        } while (j <= 10);

        // ? menu item selection
        int menuNum = 1;
        do {
            System.out.println("Menu Item - " + menuNum);
            menuNum++;
        } while (menuNum <= 3);

        // * FOR LOOP
        for (int k = 1; k <= 10; k++) {
            System.out.println("Hello World - " + k);
        }

        for (int x = 1, y = 10; x <= y; x++, y--) {
            System.out.println("Akkal Dhami - " + i);
        }

        // int i = 1;
        // ? Comma seprated variation
        // for (int i = 1, j = 1; i <= 10 && j <= 5; i++, j += 2) {
        //     System.out.println(i * j);
        // }

        // ? boolean b = true;
        // for (int i = 1; b == true; i++) {
        //     if (condition) {
        //         b = false;
        //     }
        // }

        // ? Integers -> byte, short, int, long
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }

    }
}
