import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2775_부녀회장이될테야 {

	public static void main(String[] args) throws IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Test case, 층, 호수 받기
		int testCase = Integer.parseInt(br.readLine());
		
		// Test case만큼 거주민 수 출력하기
		
		for (int i = 0; i < testCase; i++) {
			
			// 층, 호수 받기
			int floorNum = Integer.parseInt(br.readLine());
			int roomNum = Integer.parseInt(br.readLine());
			
			// 거주민 수 출력
			System.out.println(calcResidentNumber(floorNum, roomNum));
		}
		
	}
	
	static int calcResidentNumber(int floorNum, int roomNum) {
		
		// 최대 수만큼 배열 생성
		int [][] residents = new int [15][15];
		
		// 값이 고정인 호수 초기화
		for(int i = 0; i < 15; i++) {
			// 0층 호수 값 초기화
			residents[0][i] = i;
			
			// i층 1호 값 초기화
			residents[i][1] = 1;
			
		}
		
		// 규칙성 발견하여 호수 거주민 값 구하기
		for (int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				residents[i][j] = residents[i-1][j] + residents[i][j-1];
			}
		}
		return residents[floorNum][roomNum];
	}
}
