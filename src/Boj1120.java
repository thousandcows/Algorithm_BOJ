import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1120 {
    public static void main(String[] args) throws IOException {

        // 1. Read A and B
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String A = st.nextToken();
        String B = st.nextToken();

        // 2. Use brute force to minimize the differences

        int answer = A.length();

        for (int i = 0; i <= B.length() - A.length(); i++) {

            int min = 0;

            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(j + i)) min++;
            }
            answer = (answer > min) ? min : answer;
        }


        // 3. Print the answer
        System.out.println(answer);
    }
}
