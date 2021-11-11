import java.util.Scanner;

public class N_4101_크냐 {
	
	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			// 두 숫자 입력받기
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if(num1 == 0 && num2 == 0) break;
			
			// 출력
			if (num1 > num2) System.out.println("Yes");
			else System.out.println("No");
		}
		scan.close();
	}
}
