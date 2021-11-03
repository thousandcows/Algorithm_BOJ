import java.util.Scanner;

public class N_1546_평균 {
	
	
	
	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// 과목 개수 N 받기
		int subjectCount = scan.nextInt();
		
		// 현재 성적 받기을 배열 선언하기
		int [] scoreArray = new int[subjectCount];
		
		// 배열 입력받기
		for(int i = 0; i < scoreArray.length; i++) {
			scoreArray[i] = scan.nextInt();
		}
		
		// 평균 구해서 출력하기
		System.out.println(getAverage(scoreArray));
		
	}
	
	// 새 평균을 구해주는 메서드
	private static float getAverage(int[] scoreArray) {
		
		int max = maxOf(scoreArray);
		int total = 0;
		for(int i = 0; i < scoreArray.length; i++) {
			total += scoreArray[i];
		}
		
		float newAverage = 100*(float)total/(scoreArray.length*max);
				
		return newAverage;
	}
	
	// 배열에서 최댓값을 구해주는 메서드
	private static int maxOf(int[] scoreArray) {
		
		int max = scoreArray[0];
		for(int i = 1; i < scoreArray.length; i++) {
			if(scoreArray[i]>max) max = scoreArray[i];
		}
		return max;
	}
}
