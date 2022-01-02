import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_11549_IdentifyingTea {
	
	public static void main(String[] args) throws Exception {
		
		//import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Read the tea type
		String type = br.readLine();
		
		// Read the answers by each contestant using StringTokenizer
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String [] answer = new String[5];
		answer[0] = st.nextToken();
		answer[1] = st.nextToken();
		answer[2] = st.nextToken();
		answer[3] = st.nextToken();
		answer[4] = st.nextToken();
		
		// Count the number of the correct answer
		int cnt = 0;
		for(int i = 0; i < answer.length; i++) {
			if(answer[i].equals(type)) {
				cnt++;
			}
		}
		
		// Print count
		System.out.println(cnt);
	}
}
