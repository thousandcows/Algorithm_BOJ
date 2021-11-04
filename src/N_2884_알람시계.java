import java.util.Scanner;

public class N_2884_알람시계 {

	public static void main(String[] args) {

		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);

		// scan Hours and Minutes
		int hours = scan.nextInt();
		int minutes = scan.nextInt();

		// 분 단위로 변환 
		if (hours == 0) {	// 자정인 경우 24시로 바꿔줘야 함!
			hours = 24;
		} 

		int totalMin = hours*60 + minutes;

		// 45분 일찍 당기기
		int newTotalMin = totalMin - 45;

		// 시간 단위로 다시 표시하기
		int newHours = newTotalMin / 60;
		if (newHours == 24)	newHours = 0; // 24를 다시 0으로 되돌린다.
		
		int newMin = newTotalMin % 60;

		System.out.println(newHours + " " + newMin);
	}
}