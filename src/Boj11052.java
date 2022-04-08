import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11052 {

    public static void main(String[] args) throws IOException {

        // 1. Read all cards
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N + 1];
        int[] maxArr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2. Find the maxCost to have n cards
        maxArr[0] = 0;
        for (int j = 1; j <= N; j++) {
            for (int k = 1; k <= j; k++) {
                maxArr[j] = Math.max(maxArr[j], maxArr[j - k] + arr[k]);
            }
        }


        // 3. Print answer
        System.out.println(maxArr[N]);
    }

}
