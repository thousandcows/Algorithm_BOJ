import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11055 {
    public static void main(String[] args) throws IOException {

        // 1. Read sequence
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] seq = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int idx = 0;
        while (st.hasMoreTokens()) {
            seq[idx++] = Integer.parseInt(st.nextToken());
        }

        // 2. Find the maximum increasing sequence

        int max;
        for (int i = 0; i < N; i++) {

            max = seq[i];

            for (int j = 0; j < i; j++) {
                if (seq[i] > seq[j] && dp[j] + seq[i] > max) {
                    max = dp[j] + seq[i];
                }
            }
            dp[i] = max;

        }

        // 3. Print answer
        int maxSum = -1;
        for (int i = 0; i < N; i++) {
            maxSum = dp[i] > maxSum ? dp[i] :maxSum;
        }
        System.out.println(maxSum);
    }
}
