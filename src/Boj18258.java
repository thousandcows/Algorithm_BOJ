import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj18258 {
	
	private LinkedList <Integer> que = new LinkedList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Declare queue
		Boj18258 q = new Boj18258();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int commands = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < commands; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			
			switch(command) {
			
			case "push":
				q.push(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop":
				bw.write(q.pop() + "\n");
				break;
				
			case "size":
				bw.write(q.size() + "\n");
				break;
				
			case "empty":
				bw.write(q.isEmpty() + "\n");
				break;
				
			case "front":
				bw.write(q.front() + "\n");
				break;
				
			case "back":
				bw.write(q.back() + "\n");
				break;
				
			default:
				break;
			}
		}
		
		bw.flush();
		bw.close();
	}
	
	public void push(int x) {
		que.add(x);
	}
	
	public int pop() {
		
		if(isEmpty() == 1) {
			return -1;
		}else {
			return que.poll();
		}
	}
	
	public int size() {
		return que.size();
	}
	
	public int isEmpty() {
		if(que.isEmpty()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public int front() {
		
		if(isEmpty() == 1) {
			return -1;
		}else {
			return que.peek();
		}
		
	}
	
	public int back() {
		if(isEmpty() == 1) {
			return -1;
		}else {
			return que.getLast();
		}
	}
}
