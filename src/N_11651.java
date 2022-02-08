import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class N_11651 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Read the cases
		int N = Integer.parseInt(br.readLine());
		
		// Read locations using StringTokenizer
		int [][] arr = new int [N][2];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][0] = Integer.parseInt(st.nextToken());
		}
		
		// Sorting using Comparator
		Arrays.sort(arr, new Comparator<int []> () {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				System.out.println("o1 : " + o1[0] + " o1 : " + o1[1]);
				System.out.println("o2 : " + o2[0] + " o2 : " + o2[1]);
				
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		
		// Printing result using StringBuilder
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			sb.append(arr[i][0]+ " " + arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}