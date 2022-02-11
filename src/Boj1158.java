import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj1158 {

	public static void main(String[] args) throws NumberFormatException, IOException{

		// Import classes
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// Read queue size and the problem condition
		int size = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());
		
		Queue <Integer> que = new LinkedList<Integer>();

		// 3. Enqueue
		for(int i = 1; i <= size; i++) {
			que.offer(i);
		}
		
		// 4. Use iteration to dequeue 
		sb.append("<");
		
		while(que.size() != 1) {
			
			// poll and offer number that is not devided completely by 3 
			for(int j = 0; j < cnt - 1 ; j++) {
				que.offer(que.poll());
			}
			
			// append number that meets the condition
			sb.append(que.poll() + ", ");
			
			
		}
		// append the last number
		sb.append(que.poll() + ">");
		
		// 5. Print result
		System.out.println(sb);
	}
}
