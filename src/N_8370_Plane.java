import java.util.Scanner;

public class N_8370_Plane {

	public static void main(String[] args) {
	
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// n, k1, n2, k2 입력받기
		int n1 = scan.nextInt();
		int k1 = scan.nextInt();
		int n2 = scan.nextInt();
		int k2 = scan.nextInt();
		
		// 좌석의 총 합 구하여 출력하기
		int totalSeats = (n1 * k1) + (n2 * k2);
		
		System.out.println(totalSeats);
		
	}
}
