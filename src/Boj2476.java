import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2476 {

    public static void main(String[] args) throws IOException {

        // 1. Read the game
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(br.readLine());

        // 2. Calculate the score
        int first;
        int second;
        int third;
        int max = 0;
        int prize = 0;
        StringTokenizer st;

        while (times > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());
            third = Integer.parseInt(st.nextToken());

            if (first == third && second == third) {
                prize = 10000 + first * 1000;

            } else if (first != second && first != third && second != third) {
                prize = 100 * Math.max(Math.max(first, second), third);

            } else {
                if (first == second) {
                    prize = 1000 + first * 100;
                } else {
                    prize = 1000 + third * 100;
                }
            }

            if (prize > max) {
                max = prize;
            }

            times--;
        }
        // 3. Print the result
        System.out.println(max);
    }
}
