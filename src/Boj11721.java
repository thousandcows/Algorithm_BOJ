import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            cnt++;
            if (cnt == 10) {
                sb.append('\n');
                cnt = 0;
            }
        }

        System.out.println(sb);

    }
}
