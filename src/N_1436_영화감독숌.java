import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N_1436_영화감독숌 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 영화 번호 입력받기
		int movieNumber = Integer.parseInt(br.readLine());


		// 영화 제목 숫자 출력하기
		int result = findMovieNumber(movieNumber);
		System.out.println(result);

	}

	private static int findMovieNumber(int movieNumber) {
		
		int cnt = 1; // 영화를 헤아리는 변수 cnt
		int number = 666; // 첫 번째 수 : 666
		
		// 해당 순서의 영화번호가 나올 때까지 반복문 실행
		while(cnt != movieNumber) {
			
			number++;
			
			// .contains method 활용하여 666을 포함한 경우 cnt 1씩 증가
			if(String.valueOf(number).contains("666")) {
				cnt++;
			}
			
		}
		// 순서와 일치하는 영화 번호 출력
		return number;
		
	}
}