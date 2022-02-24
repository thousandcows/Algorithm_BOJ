import java.io.*;

public class Boj17103 {
	
	public static boolean prime[] = new boolean[1000001];

	public static void main(String[] args) throws NumberFormatException, IOException {

		makePrimeArray();

		// 1. Read test cases
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		// 2. Calculate each case
		StringBuilder sb = new StringBuilder();
		
		// Use Iteration to count set
		for(int i = 0; i < T; i++) {

			int N = Integer.parseInt(br.readLine());
			
			int cnt = 0, index = 2;
			
			// a. Only inspect until the number is smaller than the half of N
			while(index <= N / 2) { 
				
				if(!prime[index] && !prime[N-index]) {
					cnt++;
				}

				index++;
			}
			sb.append(cnt).append('\n');
		}
		
		// 3. Print the result
		System.out.println(sb);
	}

	private static boolean[] makePrimeArray() {

		for(int i = 2; i * i <= 1000000; i++) {
			if(!prime[i]) {
				for(int j = i * i; j <= 1000000; j += i) {
					prime[j] = true;
				}
			}
		}
		return prime;
	}
}