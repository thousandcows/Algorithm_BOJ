import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj5355 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. Read case number
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		float caseNum = 0;
		StringBuilder sb = new StringBuilder();
		
		// 2. Calculate each cases
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			caseNum = Float.parseFloat(st.nextToken());
			
			while(st.hasMoreTokens()) {
				
				String operator = st.nextToken();
				
				switch(operator) {
				case "@":
					caseNum *= 3;
					break;
				case "%":
					caseNum += 5;
					break;
				case "#":
					caseNum -= 7;
					break;
				default:
					break;
				}
			}
			// 3. Print result
			System.out.printf("%.2f\n", caseNum);
		}
	}
}
