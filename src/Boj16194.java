import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj16194 {

    public static void main(String[] args) throws IOException {

        // 1. Read all cards
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N + 1];
        int[] minArr = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int i = 1;
        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        // 2. Calculate the minimun cost
        minArr[0] = 0;

        for (int j = 1; j <= N; j++) {

            minArr[j] = arr[j];

            for (int k = 1; k <= j; k++) {
                minArr[j] = Math.min(minArr[j], minArr[j - k] + arr[k]);
            }
        }

        // 3. Print answer
        System.out.println(minArr[N]);
    }
}
