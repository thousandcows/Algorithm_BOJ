import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_11319_CountMeIn {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Read sentences using array
		int cases = Integer.parseInt(br.readLine());
		
		String [] arr = new String[cases];
		
		for(int i = 0; i < cases; i ++) {
			// Remove white space
			arr[i] = br.readLine().trim().toUpperCase().replaceAll(" ", "");
		}
		
		// Count consonants and vowels
		for(int i = 0; i < cases; i ++) {
			int conso = 0;
			int vowel = 0;
			
			for(int j = 0; j < arr[i].length(); j++) {
				char word = arr[i].charAt(j);
				if(word == 'A' || word == 'E' || word == 'I' || word == 'O' || word == 'U') {
					vowel++;
				}
			}
			conso = arr[i].length() - vowel;
			
			System.out.println(conso + " " + vowel);
		}
	}
	
}
