import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1463 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 1. Read X
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());

		// 2. Calcualte minimum count

		int [] arr = new int[X + 1];
		arr[1] = 0;

		for(int i = 2; i <= X; i++) {

			if (i % 6 == 0){
				
				int compare =  Math.min(arr[i/2], arr[i/3]);
				arr[i] = Math.min(compare, arr[i - 1]) + 1;
			}
			
			else if(i % 3 == 0) {
				arr[i] = Math.min(arr[i/3], arr[i - 1]) + 1;
			}
			
			else if(i % 2 == 0) {
				arr[i] = Math.min(arr[i/2], arr[i - 1]) + 1;
			}
			
			else {
				arr[i] = arr[i - 1] + 1;
			}
		}

		// 3. Print result
		System.out.println(arr[X]);

	}
}