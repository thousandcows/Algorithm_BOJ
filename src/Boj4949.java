import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj4949 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack <Character> stack = new Stack();

		String str; // String case to read
		char ch; // chracter to trim the String
		StringBuilder newStr;
		String answer;  // default = yes

		while(true) {

			// 1. Read the String
			str = br.readLine();

			newStr = new StringBuilder();

			for(int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if(ch == '(' || ch == ')' || ch == '[' || ch == ']') {
					newStr.append(ch);
				}
			}

			// 2. See if the String is balanced
			char word;
			
			answer = "yes";
			for(int i = 0; i < newStr.length(); i++){
				
				word = newStr.charAt(i);
				
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
						}else if(word == ']'){
							answer = "no";
							break;
						}

					}else if(stack.peek() == '[') {

						if(word == '(' || word == '[') {
							stack.push(word);
						}else if(word == ']') {
							stack.pop();
						}else if(word == ')'){
							answer = "no";
							break;
						}
					}
				}
			}
			if(!stack.isEmpty()) {
				answer = "no";
			}
			
			// 4. Clear stack
			stack.clear();
			
			// 5. Print result
			System.out.println(answer);
			
			if(str.equals(".")) {
				break;
			}
		}
	}
}