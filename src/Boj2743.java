import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2743 {
	
	public static void main(String[] args) throws IOException {
		
		// 1. Read word
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		// 2. Print result
		int length = word.length();
		System.out.println(length);
	}
}
