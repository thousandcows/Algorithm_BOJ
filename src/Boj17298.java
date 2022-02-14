import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Import Reader and Writer
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// Read case
		int number = Integer.parseInt(br.readLine());
		
		Stack <Integer> s = new Stack<Integer>();
		int [] arr = new int [number];
		
		// Push number to stack
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for(int i = 0; i < number; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < number; i++) {
			
			while(!s.isEmpty() && arr[s.peek()] < arr[i]) {
				arr[s.pop()] = arr[i];
			}
			s.push(i);
			
		}
		
		while(!s.isEmpty()) {
			arr[s.pop()] = -1;
		}
		
		for(int i = 0; i < number; i++) {
			bw.write(arr[i] + " ");
		}
		
		bw.flush();
		bw.close();
		
	}
}
