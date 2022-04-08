import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11057 {

    public static void main(String[] args) throws IOException {

        // 1. Read N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 2. Calculate
        int result = 0;

        // a. make int array
        int[][] dp = new int[N + 1][10]; // [][last digit number(0 ~ 9)]

        // b. N == 1
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        // c. N >= 2
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                // c-1. if last digit == 0, only 0 is possible
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] % 10007;
                }
                // c-2. if not, you can add the value of dp[i - 1][0 ~ j]
                else {
                    int k = j;
                    while (k >= 0) {
                        dp[i][j] += dp[i - 1][k--] % 10007;
                    }
                }
            }
        }
        // d. add numbers to find result
        for (int i = 0; i < 10; i++) {
            result += dp[N][i];
        }

        // 3. Print result
        System.out.println(result % 10007);
    }
}
