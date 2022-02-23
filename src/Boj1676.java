import java.io.*;

public class Boj1676 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. Read N
		int N = Integer.parseInt(br.readLine());
		
		// 2. Calculate the number of '0'
		int answer = factorialZero(N);
		
		// 3. Print the result
		System.out.println(answer);
	}

	private static int factorialZero(int n) {
		int cnt = 0;
		
		while(n >= 5) {
			cnt += n / 5;
			n /= 5;
		}
		
		return cnt;
	}
}