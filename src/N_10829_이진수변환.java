import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_10829_이진수변환 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 자연수 N 입력받기
		long number = Long.parseLong(br.readLine());
		
		// 이진수 출력하기
		changeIntoBinary(number);
	}
	
	static String binary = "";
	
	// 재귀 함수
	private static void changeIntoBinary(long number) {
		
		// 2로 나눈 나머지
		long digit = number % 2;
		
		// 나머지를 자리수에 맞게 더해주기
		binary = digit + binary; 
		
		// 자연수 / 2
		number /= 2;
		
		// 자연수가 0인 경우 재귀함수 종료 및 결과 출력
		if(number == 0) {
			System.out.println(binary);
			return;
		}
		
		// 자연수가 0이 아닌 동안 재귀함수 반복
		changeIntoBinary(number);
	}
}
