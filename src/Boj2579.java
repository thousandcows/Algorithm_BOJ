import java.io.*;

public class Boj2579 {
    public static void main(String[] args) throws IOException {

        // 1. Read the stairs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int height = Integer.parseInt(br.readLine());

        // 2. Allocate values to array
        int[] stairs = new int[301];
        int[] dp = new int[301];

        // the stair starts from index 1
        for (int i = 1; i <= height; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        // 3. Calculate the maximum score with DP
        dp[1] = stairs[1];
        dp[2] = dp[1] + stairs[2];

        // case 1: jump from the last step
        // (in this case, they should have jumped 2 steps at once to get there)
        // case 2: jump from the 2nd last step
        for (int i = 3; i <= height; i++) {
            dp[i] = Math.max((dp[i - 3] + stairs[i - 1]), dp[i - 2]) + stairs[i];
        }

        // 4. Print the maximum score
        System.out.println(dp[height]);
    }
}
