import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1003 {
    public static void main(String[] args) throws IOException {

        // 1. Read the test case
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 2. Make fibonacci array
        int[][] fibonacci = new int[41][2];

        fibonacci[0][0] = 1;
        fibonacci[0][1] = 0;

        fibonacci[1][0] = 0;
        fibonacci[1][1] = 1;

        // 3. Allocate values using DP
        for (int i = 2; i < 41; i++) {
            fibonacci[i][0] = fibonacci[i - 2][0] + fibonacci[i - 1][0];
            fibonacci[i][1] = fibonacci[i - 2][1] + fibonacci[i - 1][1];
        }

        // 4. Write each cases using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {

            int N = Integer.parseInt(br.readLine());

            sb.append(fibonacci[N][0] + " " + fibonacci[N][1]).append('\n');
        }

        // 5. Print result
        System.out.println(sb);
    }
}