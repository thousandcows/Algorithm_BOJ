import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj14501 {
    public static void main(String[] args) throws IOException {

        // 1. Read the schedule

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] schedule = new int[N + 1][2];
        int[] dp = new int[N + 1];

        StringTokenizer st;
        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            schedule[i][0] = Integer.parseInt(st.nextToken());
            schedule[i][1] = Integer.parseInt(st.nextToken());
        }

        // 2. Find the maximum income

        int maxIncome;
        for (int i = 1; i < N + 1; i++) {



        }



        // 3. Print the answer
        int ans = 0;
        for (int i : dp) {
            ans = Math.max(ans, i);
        }
        System.out.println(ans);
    }
}
