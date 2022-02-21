import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj17299Array {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. Read the size of array
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int [] intArray = new int[N];
		int [] count = new int [1000001];
		
		// a. Read each number
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			
			// b. Assign values to the array & calculate F()
			count[intArray[i] = Integer.parseInt(st.nextToken())]++;
			
		}
		
		// 2. Find NGFs using the concept of stack
		Stack <Integer> stack = new Stack();
		
		for(int i = 0; i < N; i++) {
			
			// a. if stack is not empty and F(stack's peek) < F(i) 
			while(!stack.isEmpty() && count[intArray[stack.peek()]] < count[(intArray[i])]) {
				intArray[stack.pop()] = intArray[i];
			}
			
			stack.push(i);
		}
		
		// b. the remaining indexs of the array, the value becomes -1
		while(!stack.isEmpty()) {
			intArray[stack.pop()] = -1;
		}
		
		// 3. Print result
		for(int i = 0; i < N; i++) {
			bw.write(intArray[i] + " ");
		}
		bw.flush();
		bw.close();
	}
}