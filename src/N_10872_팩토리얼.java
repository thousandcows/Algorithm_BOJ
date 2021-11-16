import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_10872_팩토리얼 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 정수 N 입력받기
		int N = Integer.parseInt(br.readLine());
		
		// factorial 값 = 1로 초기화
		int factorial = 1;
		
		// N이 0인 경우를 제외하고 아래 반복문으로 N이하의 자연수 모두 곱하기
		if(N != 0){
			for(int i = 1; i <= N; i++) {
				factorial *= i;
			}
		}
		
		// 결과 출력
		System.out.println(factorial);
	}
}
