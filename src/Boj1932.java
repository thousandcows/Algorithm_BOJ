import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1932 {
    public static void main(String[] args) throws IOException {

        // 1. Read the triangle
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] seq = new int[n+1];
        int[] dp = new int[n+1];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int idx = 0;
            while (st.hasMoreTokens()) {
                seq[idx++] = Integer.parseInt(st.nextToken());
            }
        }

        // 2. Find the maxSum
        int cnt = 0;
        int index = 0;
        // 전체 수를 반복한다.
        for (int j = 0; j < n; j++) { // 삼각형의 단 수를 올려준다.

            dp[j] = seq[j];

            for (int k = 0; k < j; k++) { // j단 : 숫자를 j만큼 들여보내야하고,

                // 그 index에 규칙을 부여해서 계산한다.

            }
        }
        // 3. Print the answer
        // 마지막: 배열을 한 바퀴 돌려 최댓값을 알아낸다.

        /*cnt = 1;

        while (cnt <= k) {

            if (cnt == 1) {
                dp[i] = dp[i - j - 1] + seq[i];
            } else if (cnt == k) {
                dp[i] = dp[i - n] + seq[i];
            } else {
                dp[i] = Math.max(dp[i - n], dp[i - j + 1]) + seq[i];
            }
            i++;
            cnt++;
        }

         */
    }
}
