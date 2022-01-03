import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_20673_Covid19 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Read p and q
		int p = Integer.parseInt(br.readLine());
		int q = Integer.parseInt(br.readLine());
		
		// print the color-code
		String code = "Yellow";
		
		if(q > 30) {
			code = "Red";
		} else if(p <= 50 && q <= 10) {
			code = "White";
		}
		
		System.out.println(code);
	}
}
