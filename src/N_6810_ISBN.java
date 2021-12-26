import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N_6810_ISBN {
	
	public static void main(String[] args) throws Exception {
		
		// import java.io.BufferedREader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Read digits
		int numOne = Integer.parseInt(br.readLine()) * 1;
		int numTwo = Integer.parseInt(br.readLine()) * 3;
		int numThree = Integer.parseInt(br.readLine()) * 1;
		
		int digitTen =  9 * 1 + 7 * 3 + 8 * 1 + 0 * 3 + 9 * 1 + 2 * 3 + 1 * 1 + 4 * 3 + 1 * 1 + 8 * 3;
		int total = digitTen + numOne + numTwo + numThree;
		
		// print result
		System.out.println("The 1-3-sum is " + total);
	}
}
