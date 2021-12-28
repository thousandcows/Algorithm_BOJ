import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_17009_WinningScore {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Read scores
		int threePointApple = Integer.parseInt(br.readLine());
		int twoPointApple = Integer.parseInt(br.readLine());
		int onePointApple = Integer.parseInt(br.readLine());
		int threePointBanana = Integer.parseInt(br.readLine());
		int twoPointBanana = Integer.parseInt(br.readLine());
		int onePointBanana = Integer.parseInt(br.readLine());
		
		// Calculate and compare scores
		int totalA = threePointApple * 3 + twoPointApple * 2 + onePointApple * 1;
		int totalB = threePointBanana * 3 + twoPointBanana * 2 + onePointBanana * 1;
		
		if(totalA > totalB) {
			System.out.println("A");
		} else if(totalA < totalB) {
			System.out.println("B");
		} else {
			System.out.println("T");
		}
	}
}
