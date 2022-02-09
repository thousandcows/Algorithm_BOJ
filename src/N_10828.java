import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	// Fields
	private int size;
	private int [] IntStack;
	
	// Constructors
	public Main() {
	}
	
	public Main(int size, int capacity) {
		this.size = size;
		this.IntStack = new int [capacity];
	}

	// push method
	public void push(String number) {
		IntStack[size++] = Integer.parseInt(number);
	}

	// pop method
	public int pop() {
		if(size == 0) {
			return -1;
		} else {
			int result = IntStack[size - 1];
			IntStack[size - 1] = 0;
			size--;
			return result;
		}
	}
	
	// size method
	public int size() {
		return size;
	}
	
	// empty method
	public int empty() {
		if(size == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	// top method
	public int top() {
		if(size == 0) {
			return -1;
		}else {
			return IntStack[size - 1];
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Instanciate the main class
		Main stack = new Main(0, 10000);
		
		// Import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Read the number of commands
		int commands = Integer.parseInt(br.readLine());
		
		// Using StringTokenizer to split commands
		StringTokenizer st;
		
		// Using StringBuilder to print the result
		StringBuilder sb = new StringBuilder();
					
		// Execute commands
		for(int i = 0; i < commands; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			
			if(command.equals("push")) {
				stack.push(st.nextToken());
			}
			else if(command.equals("pop")){
				sb.append(stack.pop()).append('\n');
			}
			else if(command.equals("size")) {
				sb.append(stack.size()).append('\n');
			}
			else if(command.equals("empty")) {
				sb.append(stack.empty()).append('\n');
			}
			else if(command.equals("top")){
				sb.append(stack.top()).append('\n');
			}
		}
		// Print result
		System.out.println(sb);
	}
}