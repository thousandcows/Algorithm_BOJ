import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10988 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 1. Read String
		String str = br.readLine();
		
		sb.append(str);		
		
		// 2. Reverse String
		String backwords = sb.reverse().toString();
		
		// 3. Compare and print answer
		if(str.equals(backwords)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
