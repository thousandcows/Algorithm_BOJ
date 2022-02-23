import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9613 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 1. Read the number of test case
		int cases = Integer.parseInt(br.readLine());
		
		int [] arr;
		long caseValue; // in each case the max can be 1,000,000.
						// the total caseValue may exceed the range of Integer -> use long
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < cases; i ++) {
			
			int e = 0;
			caseValue = 0;
			
			st = new StringTokenizer(br.readLine(), " ");
			
			// 2. Read numbers of each case
			int num = Integer.parseInt(st.nextToken());
			
			// a. if num == 1
			if(num == 1) {
				System.out.println(Integer.parseInt(st.nextToken()));
				return;
			} else {
				// b. else
				arr = new int[num];
				
				while(st.hasMoreTokens()) {
					arr[e++] = Integer.parseInt(st.nextToken());
				}
				
				// 3. Find the total of possible GCD
				for(int j = 0; j < arr.length - 1; j++) {
					
					for(int k = j + 1; k < arr.length; k++) {
						caseValue += findGcd(arr[j], arr[k]);
					}
				}
				sb.append(caseValue).append('\n');
			}
		}
		// 4. Print result
		System.out.println(sb);
	}
	
	public static int findGcd(int a, int b) {
		if(a % b == 0) {
			return b;
		}else {
			return findGcd(b, a % b);
		}
	}
}
