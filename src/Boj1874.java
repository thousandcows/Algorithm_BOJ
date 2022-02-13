import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj1874 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. Stack(LIFO)
		Stack<Integer> stack = new Stack();
		
		// 2. Read case number and cases
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			
			// 3. if num equals to zero, pop
			if(num == 0) {
				stack.pop();
			}
			// 4. else, push the number to the stack
			else {
				stack.push(num);
			}
		}
		
		// 5. Calcultae the total
		int total = 0;
		for(int i : stack) {
			total += i;
		}
		
		// 6. Print the result
		System.out.println(total);
	}
	
}
