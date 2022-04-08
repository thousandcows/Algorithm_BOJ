import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11655 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// 1. Read the String
		String sentence = br.readLine();

		// 2. Do ROT13
		for(int i = 0; i < sentence.length(); i++) {
			// 65 ~ 90
			// 97 ~ 122
			char letter = sentence.charAt(i);
			char newChar = (char) (letter + 13);

			if((letter >= 65 && letter <= 90)) {

				if(newChar > 90) {
					newChar = (char)(newChar - 26);
				}

				sb.append(newChar);

			} else if((letter >= 97 && letter <= 122)) {

				if(newChar > 122) {
					newChar = (char)(newChar - 26);
				}

				sb.append(newChar);
			}
			else {
				sb.append(letter);
			}
		}

		// 3. Print result
		System.out.println(sb);
	}
}