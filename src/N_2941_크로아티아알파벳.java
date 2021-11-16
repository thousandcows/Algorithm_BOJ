import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2941_크로아티아알파벳 {

	public static void main(String[] args) throws IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 문자 입력받기
		String word = br.readLine();

		// 크로아티아 알파벳 수 출력하기
		int count = 0;	// count 할 변수
		int len = word.length(); // 단어 길이
		
		for(int i = 0; i < len; i++) {
			
			// 앞에서부터 한 문자씩 끊어서 검사
			char ch = word.charAt(i);
			
			// 알파벳이 c로 시작하는 경우
			if(ch == 'c' && i < len -1) {
				if(word.charAt(i+1) == '=' || word.charAt(i+1) == '-') {
					i++; // i+2번째부터 시작하기 위해 1을 더해준다.
				}
			}
			
			// 알파벳이 d로 시작하는 경우
			else if (ch == 'd' && i < len -1) {
				if(word.charAt(i+1) == '-') { // 'd-'인 경우
					i++;
				}else if(word.charAt(i+1) == 'z' && i < len-2) {
					if (word.charAt(i+2) == '=') { // 'dz='인 경우
						i += 2; // 3글자가 한 문자이므로 2 증가해야 한다는 점 주의
					}
				}
			}
			
			// 알파벳이 l로 시작하는 경우
			else if(ch == 'l' && i < len -1) {
				if(word.charAt(i+1) == 'j') {
					i++;
				}
			}	
			
			// 알파벳이 n로 시작하는 경우
			else if(ch == 'n' && i < len -1) {
				if(word.charAt(i+1) == 'j') {
					i++;
				}
			}	
			
			// 알파벳이 s로 시작하는 경우
			else if(ch == 's' && i < len -1) {
				if(word.charAt(i+1) == '=') {
					i++;
				}
			}		
			
			// 알파벳이 z로 시작하는 경우
			else if(ch == 'z' && i < len -1) {
				if(word.charAt(i+1) == '=') {
					i++;
				}
			}			
			count++;
		}
		System.out.println(count);
	}
	
}