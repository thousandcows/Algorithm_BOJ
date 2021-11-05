import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1152_단어의개수 {

	public static void main(String[] args) throws IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// trim method로 앞뒤 공백 제거한 후 공백을 기준으로 값을 나누어 저장
		String [] strArray = br.readLine().trim().split(" ");
		
		// 공백 하나만 들어오는 경우 예외처리
		int arrLength = strArray.length;
		if (strArray[0].equals("")) {
			arrLength = 0;
		}
		
		// 글자 수 출력
		System.out.println(arrLength);
	}
}
