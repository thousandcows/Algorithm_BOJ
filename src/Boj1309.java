import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1309 {
    public static void main(String[] args) throws IOException {

        // 1. Read N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        final int MOD = 9901;

        long[][] dp = new long[N + 1][3];
        dp[1][0] = dp[1][1] = dp[1][2] = 1; // Initialize the first case

        // 2. Find ways to place lions
        for (int i = 2; i < dp.length; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % MOD;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
        }

        // 3. Print answer
        long answer = (dp[N][0] + dp[N][1] + dp[N][2]) % MOD;
        System.out.println(answer);
    }
}
