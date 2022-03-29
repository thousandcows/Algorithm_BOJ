import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9610 {
    public static void main(String[] args) throws IOException {

        // 1. Read coordinates
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 2. Count each case
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int axis = 0;

        StringTokenizer st;
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // a. q1
            if (x > 0 && y > 0) q1++;
            // b. q2
            else if(x < 0 && y > 0) q2++;
            // c. q3
            else if(x < 0 && y < 0) q3++;
            // d. q4
            else if(x > 0 && y < 0) q4++;
            // e. axis
            else axis++;

        }
        // 3. Print the answer
        System.out.println("Q1: "+ q1);
        System.out.println("Q2: "+ q2);
        System.out.println("Q3: "+ q3);
        System.out.println("Q4: "+ q4);
        System.out.println("AXIS: "+ axis);
    }
}
