import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_17863_FYI {
	public static void main(String[] args) throws IOException {
		
		// import BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Read the number
		String number = br.readLine();
		
		// Determine
		String prefix = number.substring(0, 3);
		
		// Print result
		String result = "NO";
		
		if(prefix.equals("555")) {
			result = "YES";
		} 
		
		System.out.println(result);
		
	}
}
