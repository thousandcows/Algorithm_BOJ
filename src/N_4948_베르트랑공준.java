import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_4948_베르트랑공준 {

	private static int primeSet(int number) {
		
		// 1인 경우 1을 return
		if(number < 2){
			return 1;
		}

		// number * 2 만큼 배열 생성
		int [] primeArr = new int [number * 2 + 1];

		for(int i = 0; i < number * 2; i ++) {
			primeArr[i] = 1; // 배열 값 1로 초기화
		}

		// 에라토스테네스의 체 활용하기
		primeArr[0] = primeArr[1] = 0;

		for(int i = 2; i * i < number * 2; i++) {
			
			if (primeArr[i] == 0) continue;
			
			for(int j = i * i; j < primeArr.length; j += i) {
				primeArr[j] = 0;
			}
		}

		// count = 0에서 시작
		int count = 0;	

		for(int i = number + 1 ; i < number * 2; i++) {
			if(primeArr[i] != 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력이 0이 될 때까지 반복
		int caseNum = -1;
		
		while(true) {

			// 테스트 케이스 받기
			caseNum = Integer.parseInt(br.readLine());
			
			if(caseNum == 0) break;

			// 메서드에 대입
			int primeCount = primeSet(caseNum);

			// 결과 출력
			System.out.println(primeCount);
		}
	}
}
