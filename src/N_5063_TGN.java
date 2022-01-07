import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_5063_TGN {
	
	public static void main(String[] args) {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Read test case and numbers
		try {
			int testCase = Integer.parseInt(br.readLine());
			
			for(int i = 0 ; i < testCase; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int r = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				int benefit = e - c;
				
				String result = "advertise";
				if(r > benefit) {
					result = "do not advertise";
				} else if(r == benefit) {
					result = "does not matter";
				}
				System.out.println(result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
}
