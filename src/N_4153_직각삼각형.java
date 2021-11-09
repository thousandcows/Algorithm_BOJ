import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_4153_직각삼각형 {

	public static void main(String[] args) throws IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {

			// 테스트 케이스 받기
			String [] caseNum = br.readLine().split(" ");
			int sideOne = Integer.parseInt(caseNum[0]);
			int sideTwo = Integer.parseInt(caseNum[1]);
			int sideThree = Integer.parseInt(caseNum[2]);

			// 반복문 종료 조건 : 0, 0, 0
			if (sideOne == 0) {
				break;
			}
			
			// 직각삼각형이 맞는지 출력
			System.out.println(isRightTriangle(sideOne, sideTwo, sideThree));
		}
	}
	
	// 직각삼각형 판별 메서드
	private static String isRightTriangle(int sideOne, int sideTwo, int sideThree) {
		// 기본값 right로 설정
		String message = "right";
		
		// 가장 크기가 큰 변 파악
		int max = sideOne;
		int num1 = 0;
		int num2 = 0;
		
		
		// 1번째 변이 max인 경우
		if(max >= sideTwo && max >= sideThree) {
			num1 = sideTwo;
			num2 = sideThree;
		} 
		
		// 2번째 변이 max인 경우
		else if (sideTwo > max && sideTwo >= sideThree) {
			max = sideTwo;
			num1 = sideOne;
			num2 = sideThree;
		} 
		
		// 3번째 변이 max인 경우
		else {
			max = sideThree;
			num1 = sideOne;
			num2 = sideTwo;
		}
		
		// 직각 삼각형이 아니라면 wrong 출력
		if ((max*max) != (num1*num1) + (num2*num2)) {
			message = "wrong";
		}
			
		return message;
	}
}