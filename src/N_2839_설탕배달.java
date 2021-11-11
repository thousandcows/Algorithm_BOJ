import java.util.Scanner;

public class N_2839_설탕배달 {

	public static void main(String[] args) {

		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);

		// N 입력받기
		int sugarBags = scan.nextInt();

		// 봉지의 최소 개수 출력하기
		int minBags = minimumBags(sugarBags);
		System.out.println(minBags);

	}
	
	// 최소 개수 구하는 메서드
	private static int minimumBags(int sugarBags) {
		int result = 0;

		Loop1 : // 5kg짜리 봉지를 최대한 사용한다
		for(int i = sugarBags/5; i >=0; i--) {
			Loop2 : // 3kg 봉지를 최소한으로 사용한다
			for(int j = 0; j <= sugarBags/3; j++) {

				if(i * 5 + j * 3 == sugarBags) {
					result = i + j;
					break Loop1;
				} 
			}
			if(result == 0) {result = -1;}
		}
		return result;
	} 
}