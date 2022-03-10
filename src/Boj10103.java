import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10103 {

    public static void main(String[] args) throws IOException {

        // 1. Read the game
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(br.readLine());

        // 2. Calculate the score

        int cyScore = 100;
        int sdScore = 100;
        int cy;
        int sd;
        StringTokenizer st;
        while (times > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            cy = Integer.parseInt(st.nextToken());
            sd = Integer.parseInt(st.nextToken());
            if (cy > sd) {
                sdScore -= cy;
            } else if (cy < sd) {
                cyScore -= sd;
            }
            times--;
        }
        // 3. Print the result
        System.out.println(cyScore + "\n" + sdScore);
    }
}
