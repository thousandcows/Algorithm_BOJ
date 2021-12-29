import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_18398_HOMWRK {

	public static void main(String[] args) throws Exception {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Read test case and numbers
		int testCase = Integer.parseInt(br.readLine());
		
		
		for(int j = 0; j < testCase; j++) {
			
			int questions = Integer.parseInt(br.readLine());
			
			int [][] arr = new int[questions][2];

			for(int i = 0; i < questions; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int one = Integer.parseInt(st.nextToken());
				int two = Integer.parseInt(st.nextToken());

				arr[i][0] = one + two;
				arr[i][1] = one * two;
			}

			for(int i = 0; i < questions; i++) {
				System.out.println(arr[i][0] + " " + arr[i][1]);
			}
		}
	}
}
