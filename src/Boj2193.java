import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2193 {

    public static void main(String[] args) throws IOException {
        // 1. Read N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 2. Count pinary numbers

        long [][] dp = new long[91][2];
        dp[1][0] = 0;
        dp[1][1] = 1;
        dp[2][0] = 1;
        dp[2][1] = 0;

        if (N > 2) {
            for (int i = 3; i <= N; i++) {
                dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
                dp[i][1] = dp[i - 1][0];
            }
        }

        // 3. Print answer
        System.out.println(dp[N][0] + dp[N][1]);
    }
}