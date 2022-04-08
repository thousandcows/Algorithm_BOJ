import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Boj15000 {

    public static void main(String[] args) throws IOException {

        // 1. Read the String
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 2. Convert all letters to upper-case letters

        System.out.println(str.toUpperCase(Locale.ROOT));
    }
}
