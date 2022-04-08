import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1748 {
    public static void main(String[] args) throws IOException {

        // 1. Read N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 2. Find the length of the new number
        int cnt = 0;

        for (int start = 1, len = 1; start <= N; start *= 10, len++) {

            int end = start * 10 - 1;
            if (end > N) {
                end = N;
            }
            cnt += len * (end - start + 1);

        }

        // 3. Print its length
        System.out.println(cnt);
    }
}