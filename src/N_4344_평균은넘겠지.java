import java.util.Scanner;

public class N_4344_평균은넘겠지 {
	
	public static void main(String[] args) {
		
		// import.java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// 테스트 케이스 개수 받기
		int caseNum = scan.nextInt();
		
			
		for(int i = 0; i < caseNum; i++) {
			
			// 학생 수 받아주기
			int stdNum = scan.nextInt();
			
			// 학생 점수 받아줄 배열 생성
			int [] scoreArr = new int[stdNum];
			
			// 학생 점수 받아주면서 평균 구하기
			
			int total = 0;
			
			for(int j = 0; j < scoreArr.length; j++) {
				scoreArr[j] = scan.nextInt();
				total += scoreArr[j];
			}
			
			float avg = (float)total / stdNum;
			
			// 평균 넘는 학생 비율울 소수점 셋째 자리까지 출력하기
			int count = 0;
			for(int j = 0; j < stdNum; j++) {
				if(scoreArr[j] > avg) {
					count++;
				}
			}
			float aboveAvg = ((float)count/stdNum)*100;
			System.out.printf("%.3f", aboveAvg);
			System.out.println("%");
		}
	}
}
