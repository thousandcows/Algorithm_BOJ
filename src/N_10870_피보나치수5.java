import java.util.Scanner;

public class N_10870_피보나치수5 {
	
	// 피보나치 수를 반환하는 메서드
	public static int fibonacci(int number) {
		
		// number = 1인 경우
		if(number == 1) {
			return 1;
		}
		// 2인 경우 : 0 + 1
		else if(number == 2) {
			return 1;
		}
		// 3이상인 경우
		else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
		
	}
	
	public static void main(String[] args) {
		
		// java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// 수 입력받기
		int number = scan.nextInt();
		
		// 피보나치수 출력
		System.out.println(fibonacci(number));
	}
}
