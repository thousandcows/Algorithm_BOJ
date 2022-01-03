import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_19602_DogTreats {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Read three lines of input
		int small = Integer.parseInt(br.readLine());
		int medium = Integer.parseInt(br.readLine());
		int large = Integer.parseInt(br.readLine());
		
		// Is happy or sad?
		int total = small * 1 + medium * 2 + large * 3;
		String result = "sad";
		if(total >= 10) {
			result = "happy";
		}
		System.out.println(result);
	}
}
