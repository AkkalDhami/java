import java.io.IOException;

public class Input {
    public static void main(String[] args) throws IOException {
        // int n = System.in.read();
        // System.out.println(n); //? ASCII

        String s = "";
        char ch = (char) System.in.read();
        while (ch != '\n') {
            s += ch;
            ch = (char) System.in.read();
        }
        System.out.println(s);
    }
}
