import java.util.Scanner;

public class N_2920_음계 {
	
	// 음계 static 배열 생성
	static int [] noteArr = new int [] {1,2,3,4,5,6,7,8};

	public static void main(String[] args) {

		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);

		// for문으로 입력받아 배열에 저장하기
		int [] compareArr = new int [8];

		for (int i = 0; i < compareArr.length; i++) {
			compareArr[i] = scan.nextInt();
		}

		// for문으로 연주 판별하기 (count)활용
		String result = null;

		int count = 0;

		for (int i = 0; i < compareArr.length; i++) {
			// ascending이라면 한 자릿수가 일치할 때마다 1씩 더해준다.
			if (noteArr[i] == compareArr[i]) {
				count++;
			}
			// descending이라면 한 자릿수가 일치할 때마다 1씩 빼준다.
			else if (noteArr[noteArr.length - i - 1] == compareArr[i]) 
			{
				count--;
			}

		}
		
		// 결과 출력
		if (count == 8) System.out.println("ascending");
		else if (count == -8) System.out.println("descending");
		else System.out.println("mixed");

	}
}

