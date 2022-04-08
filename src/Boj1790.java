import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1790 {
    public static void main(String[] args) throws IOException {

        // 1. Read N and K
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 2. Find the Kth number
        int ans = -1;




        // 3. Print the number
        System.out.println(ans);
    }
}
