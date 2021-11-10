import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N_5622_다이얼 {
	
		public static void main(String[] args) throws IOException {
			
			// 길이 26인 char 형 배열 생성
			char [] dialNum = new char [26];
			
			// A ~ Z 까지 배열에 담기
			char token = 'A';
			for(int i = 0; i < dialNum.length; i++ ) {
				
				dialNum[i] =  token++;
			}
			
			// import java.io.BufferedReader
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			// 단어 입력받기
			String word = br.readLine();
			
			// 변수 초기화 (총 시간, 카운트할 수)
			int totalSeconds = 0;
			int i = 0;
			
			// 단어의 글자 수만큼 반복
			while(i < word.length()) {
				
				// 배열에서 검색할 key 입력받기(word에서 한 글자씩 받으면 됨)
				char key = word.charAt(i);
				
				// 이진탐색으로 index 검색
				int index = Arrays.binarySearch(dialNum, key) ;
				
				// 총 시간에 다이얼에 걸리는 시간 더해주기
				totalSeconds += dialSeconds(index);
				i++;
				
			}
			// 결과 출력
			System.out.println(totalSeconds);
		}
		
		// index 번호에 따라 걸리는 시간 반환하는 메서드
		private static int dialSeconds(int index) {
			
			int time = 0;
			if(0 <= index && index <= 2) {
				time = 3;
			} else if(3 <= index && index <= 5) {
				time = 4;
			} else if(6 <= index && index <= 8) {
				time = 5;
			} else if(9 <= index && index <= 11) {
				time = 6;
			} else if(12 <= index && index <= 14) {
				time = 7;
			} else if(15 <= index && index <= 18) {
				time = 8;
			} else if(19 <= index && index <= 21) {
				time = 9;
			} else {
				time = 10;
			}
			return time;
		}
}