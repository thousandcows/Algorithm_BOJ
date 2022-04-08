import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11722 {
    public static void main(String[] args) throws IOException {

        // 1. Read the sequence
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] seq = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int idx = 0;
        while (st.hasMoreTokens()) {
            seq[idx++] = Integer.parseInt(st.nextToken());
        }

        // 2. Find the maxLength of LDS
        for (int i = 0; i < seq.length; i++) {

            int max = 0;
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (seq[i] < seq[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        // 3. Print the maxLength
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.println(max);
    }
}
