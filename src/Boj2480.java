import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2480 {

    public static void main(String[] args) throws IOException {

        // 1. Read numbers
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int three = Integer.parseInt(st.nextToken());

        // 2. Calculate the prize
        int number = 0;
        int result = 0;
        // a. case 1
        if (one == two && one == three && two == three) {
            result = 10000 + one * 1000;
        }
        // b. case 3
        else if (one != two && one != three && two != three) {
            number = Math.max(Math.max(one, two), three);
            result = number * 100;
        }
        // c. case 2
        else{
            number = (one == two) ? one : three;
            result = 1000 + number * 100;
        }

        // 3. Print the result
        System.out.println(result);
    }

}
