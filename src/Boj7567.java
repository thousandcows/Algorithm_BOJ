import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj7567 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char [] plates = br.readLine().toCharArray();
		
		int height = 10;
		
		for(int i = 1; i < plates.length; i++) {
			
			if(plates[i] == plates[i - 1]) {
				height += 5;
			}else {
				height += 10;
			}
			
		}
		System.out.println(height);
	}
}
