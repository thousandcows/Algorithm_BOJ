import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11727 {

    public static void main(String[] args) throws IOException {

        // 1. Read n
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[2];

        arr[0] = 1;
        arr[1] = 3;

        // 2. Find ways to fill in the square

        if (n <= 2) {
            System.out.println(arr[n - 1]);
            return;
        } else {
            int tmp;
            for (int i = 2; i <= n - 1; i++) {
                tmp = arr[1];

                arr[1] = (2 * arr[0] + arr[1]) % 10007;
                arr[0] = tmp;


            }

        }
        // 3. Print the answer
        System.out.println(arr[1]);
    }
}
