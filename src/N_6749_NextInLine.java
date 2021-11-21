import java.util.Scanner;

public class N_6749_NextInLine {
	
	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// 첫 번째, 중간 연령 받기
		int youngest = scan.nextInt();
		int middle = scan.nextInt();
		
		// 가장 많은 나이 출력
		int oldest = middle * 2 - youngest;
		System.out.println(oldest);
	}
}
