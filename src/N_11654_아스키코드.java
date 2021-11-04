import java.util.Scanner;

public class N_11654_아스키코드 {

	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// 문자 입력받기 
		char ch = scan.next().charAt(0);
		
		// 출력하기
		System.out.println((int)ch); // 숫자로 출력하기 위해선 int casting
	}

}
