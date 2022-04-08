import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj14002 {
    public static void main(String[] args) throws IOException {
        // 1. Read the sequence

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N]; // array to allocate elements
        int[] dpLength = new int[N]; // array to allocate length of each case
        String [] dpSeq = new String[N]; // array to allocate seq of each case

        // a. Allocate elements to array
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int idx = 0;
        while (st.hasMoreTokens()) {
            seq[idx++] = Integer.parseInt(st.nextToken());
        }

        // 2. Find the sequence that has the maximum length

        for (int i = 0; i < seq.length; i++) {

            // a. Initialize
            dpLength[i] = 1; // dpLength should start with 1
            String temp = "" + seq[i]; // variable to save sequence temporarily

            for (int j = 0; j < i; j++) {

                // b. Condition to be the longest sequence
                if (seq[i] > seq[j] && dpLength[i] < dpLength[j] + 1) {
                    dpLength[i] = dpLength[j] + 1;
                    temp = dpSeq[j] + " " + seq[i];
                }

            }
            // c. Save the longest sequence of each case
            dpSeq[i] = temp;
        }

        // 3. Print the sequence
        int max = -1;
        int index = 0;
        for (int i = 0; i < dpLength.length; i++) {
            if (dpLength[i] > max) {
                max = dpLength[i];
                index = i;
            }
        }

        System.out.println(max + "\n" + dpSeq[index]);
    }
}