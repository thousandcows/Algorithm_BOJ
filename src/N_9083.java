import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_9083 {
	
	public static void main(String [] args) throws NumberFormatException, IOException {
		
		// Import classes
		N_9083 tool = new N_9083();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// Read case number
		int cases = Integer.parseInt(br.readLine());
		
		// Reverse the word order by using stack
		for(int i = 0; i < cases; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			// Add words to the stack
			while(st.hasMoreTokens()) {
				
				String newWord = tool.reverseOrder(st.nextToken());
				sb.append(newWord).append(" ");
			}
			
			sb.append('\n');
			
		}
		
		// Print result
		System.out.println(sb);
	}
	
	public String reverseOrder(String word) {
		
		String result = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			result += word.charAt(i) ;
		}
		
		return result;
	}
}
