import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1912 {
    public static void main(String[] args) throws IOException {

        // 1. Read n and sequence
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 2. Find the max of sum
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());

            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        br.close();
        // 3. Print answer
        System.out.println(max);
    }
}
