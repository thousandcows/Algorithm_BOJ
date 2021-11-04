import java.util.Scanner;

public class N_11720_숫자의합 {

	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// 숫자 쪼개서 담기위한 배열 선언
		int number = scan.nextInt();
		String [] arr = new String [number];
		
		// 배열에 숫자 쪼개서 담기
		arr = scan.next().split("");
		
		// 반복문을 활용해 전체 합 구하기
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += Integer.parseInt(arr[i]);
		}
		
		// 결과 출력
		System.out.println(total);
		
	}

}
