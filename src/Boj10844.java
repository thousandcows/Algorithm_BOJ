import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10844 {

    public static void main(String[] args) throws IOException {

        // 1. Read N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 2. Find numbers
        long [][] dpArr = new long[101][10];
        long result = 0;
        long mod = 1000000000;

        dpArr[1][0] = 0;
        for (int i = 1; i < 10; i++) {
            dpArr[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dpArr[i][j] = dpArr[i - 1][j + 1] % mod;
                } else if (j == 9) {
                    dpArr[i][j] = dpArr[i - 1][j - 1] % mod;
                } else {
                    dpArr[i][j] = (dpArr[i - 1][j - 1] + dpArr[i - 1][j + 1]) % mod;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            result += dpArr[N][i];
        }

        // 3. Print result
        System.out.println(result % 1000000000);
    }


}
