import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11726 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 1. Read n
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 2. Count the number of cases by using its width
		
		if(n == 1 || n == 2) {
			System.out.println(n);
		}
		else {
			
			int [] arr = new int [n + 1];
			arr[1] = 1;
			arr[2] = 2;

			for(int i = 3; i <= n; i++) {

				arr[i] = arr[i - 1] + arr[i - 2];
				arr[i] %= 10007;
			}
			System.out.println(arr[n]);
		}		
	}
}