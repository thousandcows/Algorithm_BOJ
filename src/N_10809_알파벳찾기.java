import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_10809_알파벳찾기 {

	public static void main(String[] args) throws IOException {

		// a ~ z를 상징하는 배열 생성(모든 값 -1로 초기화)
		int [] alphabet = new int [26];
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 단어 입력받기
		String word = br.readLine();

		// 중첩 반복문으로 출력한 단어 길이를 분석하기
		for (int i = 0; i < word.length(); i++) {
			for(int j = 0; j < alphabet.length; j++) {
				
				// 이미 값이 입력된 경우, 반복문 끝으로 이동
				if (alphabet[j] != -1) {
					continue; 
				}
				// 입력된 적이 없는 경우 첫 번째 위치 추가
				if (word.charAt(i)== j + 97) { 
					alphabet[j] = i;
				}
			}
		}
		
		// 반복문을 활용해 값 출력
		for(int i : alphabet) {
			System.out.print(i + " ");
		}
	}
}