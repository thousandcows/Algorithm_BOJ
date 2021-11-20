import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_9020_골드바흐의추측 {
	
	// 에라토스테네스의 체를 활용해 소수 배열 반환	
	public static boolean [] primeSet() {

		boolean [] primeSet = new boolean[10001];

		for(int i = 0; i < 10001; i++) {
			primeSet[i] = true;
		}
		primeSet[0] = primeSet[1] = false;

		for(int i = 2; i * i < primeSet.length; i++) {

			if(primeSet[i] == false) continue;

			for(int j = i * i; j < primeSet.length; j += i) {
				primeSet[j] = false;
			}
		}
		return primeSet;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		// java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 테스트케이스 입력받기
		int cases = Integer.parseInt(br.readLine());

		// 테스트 케이스만큼 골드바흐 파티션 출력하기
		boolean [] primeSet = primeSet();
		
		for(int i = 0; i < cases; i++) {
			
			// 숫자 입력받기
			int caseNum = Integer.parseInt(br.readLine());
			
			// 입력된 숫자의 절반인 지점에서부터 시작(차이가 가장 작아야 하므로)
			int p1 = caseNum / 2;
			int p2 = caseNum - p1;
			
			while(true) {
				
				// P1, P2가 소수인지 확인해 맞으면 출력
				if(primeSet[p1] == true && primeSet[p2] == true) {
					System.out.println(p1 + " " + p2);
					break;
				}
				// P1, P2가 소수가 아니라면 각각 1씩 감산, 가산
				else {
					p1--;
					p2++;
					
				}
			}
		}
	}
}