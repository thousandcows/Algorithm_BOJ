import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Boj11656 {
	
	public static void main(String[] args) throws IOException {
		
		// 1. Import
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> stack = new Stack();
		
		// 2. Read String
		String str = br.readLine();
		String [] strArray = new String [str.length()];
		
		// 3. Input String in queue in character & Put Strings in array
		for(int i = 0; i < str.length(); i++) {
			strArray[i] = str.substring(i);
		}
		
		// 4. Sort
		for(int i = 0; i < str.length(); i++) {
			
			String word = strArray[i];
			
			// if stack is empty
			if(stack.isEmpty()) {
				stack.push(word);
			}
			// if stack is not empty
			else {
				// if the peek of stack is bigger than the word, push word
				if(stack.peek().compareTo(word) > 0) {
					
					stack.push(word);
					
				}
				// if not, pop the element and assign it to the array, i--
				else {
					while(!stack.isEmpty() && stack.peek().compareTo(word) < 0) {
						
						strArray[i--] = stack.pop();
						
					}
					stack.push(word);
					
				}
			}
		}
		
		// 5. Print the result
		while(!stack.isEmpty()) {
			
			bw.write(stack.pop() + '\n');
			
		}
		bw.flush();
		bw.close();
		
	}
}
