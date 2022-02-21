import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10214 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Read test information
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String score;
		int Yonsei;
		int Korea;
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// Determine the each game result
		for(int i = 0; i < T; i++) {
			
			Yonsei = Korea = 0;
			
			for(int j = 0; j < 9; j++) {
				
				st = new StringTokenizer(br.readLine(), " ");
				
				Yonsei += Integer.parseInt(st.nextToken());
				Korea += Integer.parseInt(st.nextToken());
								
			}
			
			if(Yonsei > Korea) {
				sb.append("Yonsei");
			}else if(Korea > Yonsei) {
				sb.append("Korea");
			}else {
				sb.append("Draw");
			}
			sb.append('\n');
		}
		
		// Print result
		System.out.println(sb);
	}
}