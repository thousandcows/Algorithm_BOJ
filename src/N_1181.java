import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class N_1181 {
	
	public static void main(String [] args) {
		
		// Import Reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			// Read  the number of words
			int words = Integer.parseInt(br.readLine());
			
			// Allocate values to the array
			String [] arr = new String [words];
			int i = 0;
			
			while(i < words) {
				arr[i++] = br.readLine();
			}
			
			// Sorting  using Comparator
			Arrays.sort(arr, new Comparator<String>() {
				
				// Sorting method using compare
				public int compare(String str1, String str2) {
					
					// If lengths are same
					if(str1.length() == str2.length()) {
						return str1.compareTo(str2);
					}
					
					// etc
					else {
						return str1.length() - str2.length();
					}
				}
			});
			
			// Printing the result using BufferedWriter
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			bw.write(arr[0]+'\n');
			
			for(int j = 1; j < words; j++) {
				
				if(!arr[j].equals(arr[j-1])) {
					bw.write(arr[j]+'\n');
				}
			}
			bw.flush();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
