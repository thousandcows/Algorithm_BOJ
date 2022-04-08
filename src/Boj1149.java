import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1149 {

    public static int N;
    public static int[][] HOUSES;

    public static void main(String[] args) throws IOException {

        // 1. Read N and all cases
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        HOUSES = new int[N + 1][3];
        int[][] dp = new int[N + 1][2];

        StringTokenizer st;
        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < 3; j++) {
                HOUSES[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2. Use Dynamic Programming to find out minimum cost
        int[] min = new int[3];

        dp[1][1] = min(HOUSES[1][0], HOUSES[1][1], HOUSES[1][2]);
        int idx;

        for (int i = 2; i < N + 1; i++) {
            if (dp[i - 1][0] == 0) {
                idx = minIndex(i, 1, 2);
                dp[i][0] = idx;
                dp[i][1] = dp[i - 1][1] + HOUSES[i][idx];
            } else if (dp[i - 1][0] == 1) {
                idx = minIndex(i, 0, 2);
                dp[i][0] = idx;
                dp[i][1] = dp[i - 1][1] + HOUSES[i][idx];
            } else {
                idx = minIndex(i, 0, 1);
                dp[i][0] = idx;
                dp[i][1] = dp[i - 1][1] + HOUSES[i][idx];
            }
        }

        // 3. Print the answer
        int ans = Integer.MAX_VALUE;

        for (int i : min) {
            ans = (ans > i) ? i : ans;
        }
        System.out.println(ans);

    }

    private static int minIndex(int idx, int a, int b) {
        if (HOUSES[idx][a] < HOUSES[idx][b]) {
            return a;
        } else {
            return b;
        }
    }

    private static int min(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
}
