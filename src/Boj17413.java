import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Boj17413 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack <Character> stack = new Stack();

		Boolean flag = false;

		String sentence = br.readLine();
		
		
		for(int i = 0; i < sentence.length(); i++) {

			char ch = sentence.charAt(i);

			// 1. character == '<' 
			if(ch == '<') {

				// write things in advance
				while(!stack.isEmpty()) {
					bw.write(stack.pop());
				}

				flag = true;

				// write '<'
				bw.write(ch);

			// 2. character == '>'
			}else if(ch == '>') {

				flag = false;

				bw.write(ch);
			}
			
			// 3. flat == true
			else if(flag){

				bw.write(ch); // write in original order

			}
			// 4. flag == false
			else {
				if(ch == ' ') {

					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}

					bw.write(ch);
				}
				else {
					stack.push(ch);
				}
			}
		}
		
		// Empty the stack (for the last word)
		while(!stack.isEmpty()) {
			bw.write(stack.pop());
		}
		
		// Print out the result
		bw.flush();
		bw.close();
	}
}