import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Boj11656Array {

	public static void main(String[] args) throws IOException {

		// 1. Import
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Character> q = new LinkedList();
		Stack<String> stack = new Stack();

		// 2. Read String
		String str = br.readLine();
		String [] strArray = new String [str.length()];

		for(int i = 0; i < str.length(); i++) {
			q.add(str.charAt(i));
		}

		// 3. Input String in queue in character
		for(int i = 0; i < str.length(); i++) {
			String element = "";
			int index = 0;
			while(index < q.size()) {

				element += q.get(index++);

			}
			// 4. Put Strings in array
			strArray[i] = element;
			q.poll();
		}

		// 5. Sort
		Arrays.sort(strArray);

		// 6. Print result
		for(String s : strArray) {
			System.out.println(s);
		}
	}
}
