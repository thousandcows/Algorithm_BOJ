import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10102 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int voters = Integer.parseInt(br.readLine());
		String vote = br.readLine();
		
		int A = 0;
		int B = 0;
		
		for(int i = 0; i < voters; i++) {
			if(vote.charAt(i) == 'A') {
				A++;
			} else {
				B++;
			}
		}
		
		String result = "Tie";
		if(A > B) {
			result = "A";
		}else if(B > A) {
			result = "B";
		}
		
		System.out.println(result);
		
	}
	
}
