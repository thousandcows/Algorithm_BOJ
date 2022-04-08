import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11053 {
    public static void main(String[] args) throws IOException {

        // 1. Read sequence A
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int idx = 0;
        while (st.hasMoreTokens()) {
            arr[idx++] = Integer.parseInt(st.nextToken());
        }

        // 2. Find the maximum length
        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        // 3. Print the length
        int maxLength = dp[0];
        for (int i = 1; i < dp.length; i++) {
            maxLength = dp[i] > maxLength ? dp[i] : maxLength;
        }

        System.out.println(maxLength);

    }
}