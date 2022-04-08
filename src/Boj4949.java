import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj4949 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack <Character> stack = new Stack();

		String str; // String case to read
		String answer;  // default = yes
		StringBuilder sb = new StringBuilder();

		while(true) {

			// 1. Read the String
			str = br.readLine();
			
			// End condition
			if(str.equals(".")) {
				break;
			}

			// 2. See if the String is balanced
			char word;
			
			for(int i = 0; i < str.length(); i++){
				
				word = str.charAt(i);
				
				// if stack is empty
				if(stack.isEmpty()) {
					// a. if closing parenthesis come first
					if((word == ')' || word == ']')) {
						answer = "no";
						break;
					}else if(word == '(' || word == '[') {
						stack.push(word);
					}

				// stack not empty
				}
				else {
					
					if(stack.peek() == '(') {

						if(word == '(' || word == '[') {
							stack.push(word);
						}else if(word == ')') {
							stack.pop();
						}

					}else if(stack.peek() == '[') {

						if(word == '(' || word == '[') {
							stack.push(word);
						}else if(word == ']') {
							stack.pop();
						}
					}
				}
				
				// 4. Final check
				if(stack.isEmpty()) {
					sb.append("yes").append('\n');
				} else {
					sb.append("no").append('\n');
				}
				
			}
			
			// 4. Clear stack
			stack.clear();
			
		}
		
		// 5. Print result
		System.out.println(sb);
	}
}