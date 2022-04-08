import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj22966 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String easist = "";
        String problem;
        int proLevel;
        int minLevel = 5;

        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            problem = st.nextToken();
            proLevel = Integer.parseInt(st.nextToken());

            if (proLevel < minLevel) {
                easist = problem;
                minLevel = proLevel;
            }
        }

        System.out.println(easist);
    }

}
