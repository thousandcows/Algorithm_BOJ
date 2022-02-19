import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj17094 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		String string = br.readLine();
		
		int two = 0;
		int e = 0;
		for(int i = 0; i < length; i++) {
			
			if(string.charAt(i) == '2') {
				two++;
			}else {
				e++;
			}
		}
		System.out.println((two == e) ? "yee" : (two > e) ? "2" : "e");
	}
}
