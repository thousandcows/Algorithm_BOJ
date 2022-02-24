import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1373 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. Read binary number
		String number = br.readLine();

		int length = number.length();

		// 2. Change it into Octagonal number
		StringBuilder sb = new StringBuilder();
		if(length % 3 == 1) {
			sb.append(number.charAt(0)); 
		}
		else if(length % 3 == 2) {
			sb.append((number.charAt(0) - '0') * 2 + (number.charAt(1) - '0'));
		}
		for(int i = length % 3; i < length; i+=3) {
			sb.append((number.charAt(i) - '0') * 4 + (number.charAt(i + 1) - '0') * 2 + (number.charAt(i + 2) - '0'));
		}
		
		// 3. Print answer
		System.out.println(sb);
	}
}