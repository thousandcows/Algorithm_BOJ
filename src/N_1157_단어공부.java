import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1157_단어공부 {

	public static void main(String[] args) throws IOException {



		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 길이 26인 배열 생성
		int [] countArr = new int [26];

		// String형으로 문자 입력받기
		String word = br.readLine();

		// 반복문 & 배열 활용해서 단어 수 세기
		for(int i = 0; i < word.length(); i++) {

			// 대문자인 경우
			if(65 <= word.charAt(i) && word.charAt(i) <= 90) {
				countArr[word.charAt(i)-65]++;
			}

			// 소문자인 경우
			if(97 <= word.charAt(i) && word.charAt(i) <= 122) {
				countArr[word.charAt(i)-97]++;
			}
		}

		// 결과 출력
		char result = sortArray(countArr);
		System.out.println(result);

	}
	// 가장 많이 사용한 문자를 돌려주는 메서드
	private static char sortArray(int[] arr) {
		char result = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				result = (char)(i + 65);
			} else if(arr[i] == max) {
				result = '?';
			}
		}
		return result;
	}
}
