import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Boj1406 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Long start = System.currentTimeMillis();
		
		// Create LinkedList
		LinkedList <Character> list = new LinkedList();

		// Import BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// Read string and cases
		String str = br.readLine();
		int cases = Integer.parseInt(br.readLine());
		
		// Add to LinkList
		for(int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		// Use iteration to do command
		ListIterator<Character> iter = list.listIterator();
		
		while(iter.hasNext()) {
			iter.next();
		}
		
		for (int i = 0; i < cases; i++) {

			String command = br.readLine();

			switch(command.charAt(0)) {

			// cursor moves to the left
			case 'L':
				if(iter.hasPrevious()) {
					iter.previous();
				}
				break;

			// cursor moves to the right
			case 'D':
				if(iter.hasNext()) {
					iter.next();
				}
				break;

			// cursor removes the word on its left
			case 'B':
				if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break;

			// cursor add 'word' to its left
			case 'P':
				char word = command.charAt(2);
				iter.add(word);
				break;

			default:
				break;
			}
		}

		// Print result
		for(Character ch : list) {
			bw.write(ch);
		}
		
		bw.flush();
		bw.close();
	}
}
