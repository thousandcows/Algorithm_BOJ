import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10820 {
	
	public static void main(String[] args) throws IOException {
		
		// 1. Read Strings
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int [] counts = new int[4];
		
		while((str = br.readLine()) != null) {

			counts[0] = counts[1] = counts[2] = counts[3] = 0;
			
			// 2. Count uppercase, lowercase, spce, number
			for(int i = 0; i < str.length(); i++) {
				
				char ch = str.charAt(i);
				
				// a. lower case count
				if(ch >= 'a' && ch <= 'z') {
					counts[0]++;
				}
				// b. upper case count
				else if(ch >= 'A' && ch <= 'Z') {
					counts[1]++;
				}
				// d. space count
				else if(ch == ' ') {
					counts[3]++;
				}
				// c. number count
				else {
					counts[2]++;
				}
			}
			
			// 3. Print the result
			StringBuilder sb = new StringBuilder();
			for(int i : counts) {
				sb.append(i).append(' ');
			}
			System.out.println(sb);
		}
	}
}