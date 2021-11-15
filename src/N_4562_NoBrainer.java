import java.util.Scanner;

public class N_4562_NoBrainer {
	
	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// test case 입력받기
		int cases = scan.nextInt();
		
		// test case 만큼 결과 출력하기
		while(cases > 0) {
			
			int brains = scan.nextInt();
			int requiered = scan.nextInt();
			
			if(brains >= requiered) {
				System.out.println("MMM BRAINS");
			} else {
				System.out.println("NO BRAINS");
			}
			cases--;
		}
	}
}
