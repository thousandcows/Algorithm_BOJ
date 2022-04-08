import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class Boj12015 {

    public static Vector<Integer> vt = new Vector<Integer>();

    private static void doBinarySearch(int target) {
        int start = 0;
        int end = vt.size();

        while (start < end) {
            int mid = (start + end) / 2;
            if (vt.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        vt.set(end, target);
    }

    public static void main(String[] args) throws IOException {

        // 1. Read N and sequence A
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 2. Find the longest sequence with Binary Search
        for (int i = 0; i < N; i++) {

            int element = Integer.parseInt(st.nextToken());

            // a. If it is the first element, add
            if (i == 0) {
                vt.add(element);
            }
            // b. else if, if the next element is greater than the last element, add
            else if (element > vt.lastElement()) {
                vt.add(element);
            }
            // c. else, do binary search to find element to replace
            else {
                doBinarySearch(element);
            }
        }

        // 3. Print answer
        System.out.println(vt.size());
    }


}
