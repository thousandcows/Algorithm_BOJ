import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj1874 {

	public static void main(String[] args) throws NumberFormatException, IOException  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. Read n, and numbers of target array
		int n = Integer.parseInt(br.readLine());
		int [] target = new int[n];

		for(int i = 0; i < n; i++) {
			target[i] = Integer.parseInt(br.readLine());
		}

		// 2. Use stack to see if they can be pushed in asc order
		Stack <Integer> stack = new Stack();
		StringBuilder sb = new StringBuilder();

		
		int index = 0;
		int i = 0;
		while(true) {
			// a. !isEmpty() && stack.peek() == targetArray[i] : pop
			while(!stack.isEmpty() && stack.peek() == target[index]) {
				stack.pop();
				sb.append("-").append('\n');
				index++; // move to the next number in target array
			}
			
			if(i == n) break; // while loop end condition
			
			// b. push if they finished the first while loop
			stack.push(++i);
			sb.append("+").append('\n');
		}

		// 3. If stack !isEmpty() -> "no"
		if(!stack.isEmpty()) {
			System.out.println("NO");
		} else {
			System.out.println(sb);
		}
	}
}