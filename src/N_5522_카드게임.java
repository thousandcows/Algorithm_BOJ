import java.util.Scanner;

public class N_5522_카드게임 {
	
	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// 총합을 담을 변수 total
		int total = 0;
		
		// token이 없을 때까지 반복문 실행
		while(scan.hasNextInt()) {
			
			total += scan.nextInt();
			
		}
		// 결과 출력
		System.out.println(total);
	}

}
