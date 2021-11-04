import java.util.Scanner;

public class N_8958_OX퀴즈 {

	public static void main(String[] args) {

		//import Java.util.Scanner
		Scanner scan = new Scanner(System.in);

		// 테스트케이스 개수 받기
		int caseNum = scan.nextInt();

		// 테스트케이스들을 저장할 String형 배열 생성
		String [] testArray = new String [caseNum];

		// for문으로 케이스들을 배열에 입력

		for(int i = 0; i < testArray.length; i++) {
			testArray[i] = scan.next();
		}

		scan.close();


		// 케이스마다 점수를 출력한다.
		for (int i = 0; i < testArray.length; i++) {

			int count = 0; 
			int score = 0;

			for(int j = 0; j < testArray[i].length();j++) {

				
				if(testArray[i].charAt(j) == 'O') { // 주의 : char형은 single quotation으로 둘러싸야함! 
					count++;
				}
				else {
					count = 0;
				}
				
				score += count;
			}
			System.out.println(score);
		}
	}
}