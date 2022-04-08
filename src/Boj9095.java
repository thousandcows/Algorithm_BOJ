import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9095 {

    public static void main(String[] args) throws IOException {

        // 1. Read the test case T
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 2. Read each case and calculate
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;

        for (int i = 3; i <= 11; i++) {

            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];

        }
        // 3. Print the result
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n - 1]).append('\n');
        }
        System.out.println(sb);
    }
}
