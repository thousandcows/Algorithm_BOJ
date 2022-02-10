import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.tools.Tool;

public class N_9012 {

	// Member Field
	private int size;
	private ArrayList<String> stack;

	// Constructor
	public N_9012() {
		super();
	}

	public N_9012(int size) {
		super();
		this.size = size;
		this.stack = new ArrayList<String>();
	}

	// main
	public static void main(String[] args) throws NumberFormatException, IOException {

		// Import
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// Instanciate the main class
		N_9012 tool = new N_9012(0);

		// Read test case
		int cases = Integer.parseInt(br.readLine());

		// Analyze each case using iteration
		for(int i = 0; i < cases; i++) {

			String result = tool.isVps(br.readLine());

			sb.append(result).append('\n');
		}

		// Print results
		System.out.println(sb);
	}

	// isVps method
	public String isVps(String ps) {

		int length = ps.length();

		for(int i = 0; i < length; i++) {

			String p = Character.toString(ps.charAt(i));

			// if p is "(", then push
			if(p.equals("(")) {
				push(p);
			}
			// if p is ")" and isEmpty, then NO.
			else if (isEmpty()){
				return "NO";
			}
			// if p is ")" and isEmpty, then NO.
			else {
				pop();
			}
		}

		if(isEmpty()) {
			return "YES";
		}
		else {
			size = 0;
			return "NO";
		}
	}

	// pop method
	public void pop() {
		stack.remove(size-1);
		size--;
	}

	// push method
	public void push(String p) {
		stack.add(p);
		size++;
	}

	// isEmpty method
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}