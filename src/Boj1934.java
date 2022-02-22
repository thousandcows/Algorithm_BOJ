import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1934 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. Read the case number
		int cases = Integer.parseInt(br.readLine());
		
		// 2. Find Least Common Multiple of each case
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a;
		int b;
		for(int i = 0; i < cases; i ++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a == b) {
				sb.append(a).append("\n");
			}else {
				sb.append(findLcm(a,b)).append("\n");
			}
			
		}
		// 3. Print result
		System.out.println(sb);
	}

	private static Object findLcm(int a, int b) {
		int gcd;
		int small = a, large = b;
		int remainder;
		
		if(a > b) {
			large = a;
			small = b;
		}
		
		// 1. find gcd
		while(true) {
			
			remainder = large % small;
			
			if(remainder == 0) {
				gcd = small;
				break;
			}else {
				large = small;
				small = remainder;
			}
		}
		
		// 2. return lcm
		return a * b / gcd;
	}
}
