public class break_continue {
    public static void main(String[] args) {
        //? continue
        // for (int i = 1; i <= 10; i++) {
        //     if (i == 5) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        //? break
        // for (int i = 1; i <= 10; i++) {
        //     if (i == 5) {
        //         break;
        //     }
        //     System.out.println(i);
        // }

        //? labels
        outer: for (int i = 1; i <= 10; i++) {
            inner: for (int j = 1; j <= 10; j++) {
                if (j == 5) {
                    continue outer;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
