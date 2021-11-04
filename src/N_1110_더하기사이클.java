import java.util.Scanner;

public class N_1110_더하기사이클 {

	public static void main(String[] args) {

		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);

		// 숫자 입력받기
		int number = scan.nextInt();

		// 더하기 사이클
		int times = 0;
		int newNum = number;
		
		while(true) {

			if (newNum < 10) {
				
				newNum = (newNum * 10) + newNum;
				
			} else {
				int shareNum = newNum / 10;
				int remainNum = newNum % 10;

				newNum = (remainNum * 10) + (shareNum + remainNum)%10;
			}
			times++;
			
			if (newNum == number) {
				System.out.println(times);
				break;
			}
		}	
	}
}