import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj10845 {

	// Make queue using ArrayList
	private int size;
	private ArrayList<Integer> queue;

	// Constructor
	public Boj10845() {
		this.size = 0;
		this.queue = new ArrayList<Integer>();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		// Import classes
		Boj10845 que = new Boj10845();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		// Read cases
		int cases = Integer.parseInt(br.readLine());
		
		int result = 0;
		
		for(int i = 0; i < cases; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			String command = st.nextToken();
			
			if(command.equals("push")) {
				que.push(Integer.parseInt(st.nextToken()));
				continue;
			}
			else if(command.equals("pop")) {
				result = que.pop();
			}
			else if(command.equals("size")) {
				result = que.size();
			}
			else if(command.equals("empty")) {
				result = que.empty();
			}
			else if(command.equals("front")) {
				result = que.front();
			}
			else if(command.equals("back")) {
				result = que.back();
			}
			sb.append(result).append('\n');
		}

		// Print result
		System.out.println(sb);

	}
	// push method
	public void push(int number) {
		queue.add(number);
		size++;
	}
	
	// pop method
	public int pop() {
		if(size()  == 0) {
			return -1;
		}
		else {
			int result = queue.get(0);
			queue.remove(0);
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
		}
		else {
			return 0;
		}
	}
	
	// front method
	public int front() {
		if(size() == 0) {
			return -1;
		}
		else {
			return queue.get(0);
		}
	}

	// back method
	public int back() {
		if(size() == 0) {
			return -1;
		}
		else {
			return queue.get(size - 1);
		}
	}
}
