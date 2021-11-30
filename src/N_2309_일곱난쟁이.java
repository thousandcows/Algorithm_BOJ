import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class N_2309_일곱난쟁이 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 
		int [] arr = new int[9];
		int total = 0;
		for(int i = 0; i < 9; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
		}
		
		Arrays.sort(arr);
		
		Loop1:
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(total - arr[i] - arr[j] == 100) {
					arr[i] = arr[j] = 0;
					break Loop1;
				}
			}
		}
		
		for(int i : arr) {
			if(i != 0) {
				System.out.println(i);
			}
		}
	}
}
