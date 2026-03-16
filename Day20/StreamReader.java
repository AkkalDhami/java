import java.io.*;
public class StreamReader {
    public static void main(String[] args) throws IOException {
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println(s);
    }
}
