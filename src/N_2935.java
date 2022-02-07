import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class N_2935_소음 {
	
	public static void main(String [] args) throws IOException {
		
		// Impoprt BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Use BigInteger to read numbers
		BigInteger A = new BigInteger(br.readLine());
		
		String cal = br.readLine();
		
		BigInteger B = new BigInteger(br.readLine());
		
		// Calculate and allocate answer
		BigInteger answer = null;
		if(cal.equals("*")) {
			answer = A.multiply(B);
		} else {
			answer = A.add(B);
		}
		
		// Print answer
		System.out.println(answer);
		
	}

}
