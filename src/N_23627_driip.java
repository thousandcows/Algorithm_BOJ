import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_23627_driip {

	public static void main(String[] args) throws IOException {

		// java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 문자열 입력받기
		String str = br.readLine();

		// 메서드에 대입해 결과값 받기
		int result = isCute(str);

		// 결과 출력
		if(result > 0) System.out.println("cute");
		else System.out.println("not cute");
	}

	// 귀여움을 판단하는 메서드
	private static int isCute(String str) {
		// 결과값
		int result = -1;

		// 문자열 길이
		int strLength = str.length();

		// 문자열의 길이가 정확히 5인 경우
		if(strLength == 5 && str.equals("driip")) {
			result = 1;
		}

		// 문자열의 길이가 5를 초과하는 경우
		else if(strLength > 5){
			String lastFiveWords = "" + str.charAt(strLength - 5) + str.charAt(strLength - 4) + str.charAt(strLength - 3) + str.charAt(strLength - 2) + str.charAt(strLength - 1);
			if(lastFiveWords.equals("driip")) {
				result = 1;
			}
		}
		return result;
	}
}