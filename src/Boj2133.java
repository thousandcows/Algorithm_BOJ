import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2133 {
    public static void main(String[] args) throws IOException {

        // 1. Read N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[31][2];

        // 2. Use Dynamic Programming to find the number of cases
        // 1 또는 2로 채워짐
        dp[2][0] = 2;
        dp[2][1] = 1;

        // 3. Print the answer
        System.out.println(dp[N]);
    }
}
