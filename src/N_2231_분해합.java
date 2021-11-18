import java.util.Scanner;

public class N_2231_분해합 {
	
	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// 자연수 받기
		int target = scan.nextInt();
		
		// 생성자 값 초기화
		int decomposedNum = 0;
		
		// 1부터 target - 1 까지 생성자 검색
		for(int i = 1; i < target; i++) {
			
			// i
			int number = i;
			
			// 자리수 합을 저장할 변수
			int digitSum = 0;
			
			// 자리수 마다 변수에 더해주기
			while(number != 0) {
				digitSum += number % 10;
				number /= 10;
			}
			
			// 분해합에 해당한다면 생성자에 해당 i값 저장
			if(digitSum + i == target) {
				decomposedNum = i;
				break;
			}
		}
		// 결과 출력
		System.out.println(decomposedNum);
	}
}
