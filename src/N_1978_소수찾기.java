import java.util.Scanner;

public class N_1978_소수찾기 {

	public static void main(String[] args) {

		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);

		//테스트 케이스 받아주기
		int caseNum = scan.nextInt();

		
		int count = 0;	// 소수 개수 반영할 변수 count
		
		// 케이스 수 만큼 반복문 실행
		for(int i = 0; i < caseNum; i++) {

			int number = scan.nextInt();

			// 소수면 count++
			if(isPrime(number)) {
				count++;
			}

		}
		// 결과 출력
		System.out.println(count);
	}
	
	// 소수인지 확인해주는 메서드
	private static boolean isPrime(int number) {
		// 입력된 숫자가 1인 경우 false 반환
		if(number == 1) {
			return false;
		// 입력된 숫자가 1이 아닌 경우
		} else {
			for(int i = 2; i < number; i ++) {
				// 2 ~ number - 1 사이 숫자 중 하나라도 나눠 떨어지는 경우
				if(number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
