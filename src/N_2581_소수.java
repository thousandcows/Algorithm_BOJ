import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2581_소수 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// M, N 받기
		int startNum = Integer.parseInt(br.readLine());
		int endNum = Integer.parseInt(br.readLine());

		// 소수의 합과 최소값 출력하기

		int total = 0; // 소수의 총합
		int min = 10001; // 최솟값 초기값
		
		// 입력한 값 만큼만 반복문 실행
		for(int i = startNum; i <= endNum; i++) {
			int count = 0;
			
			// 2 ~ i 사이에 하나라도 나누어 떨어지는 경우 반복문 종료
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					break;
				} else {	// 그렇지 않은 경우 확인 count++
					count++;
				}
			}
			// 2 ~ i까지 모든 수로 나누어 떨어지지 않는 경우 총합++, 최솟값 비교
			if (count == i - 2) {
				total += i;
				if(min > i) {
					min = i;
				}
			}
		}
		
		// 결과 출력
		if(total != 0) { 				// 소수가 존재하는 경우
			System.out.println(total);
			System.out.println(min);
		} else {						// 소수가 없는 경우
			System.out.println(-1);
		}
	}
}