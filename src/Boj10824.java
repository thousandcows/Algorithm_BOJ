import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10824 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. Read A, B, C, D
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 2. A + B , C + D
		String A = st.nextToken();
		String B = st.nextToken();
		String C = st.nextToken();
		String D = st.nextToken();
		
		long partOne = Long.parseLong(A + B);
		long partTwo = Long.parseLong(C + D);
		
		long total = partOne + partTwo;
		
		// 3. Print result
		System.out.println(total);
	}
	
}
