import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_9020_골드바흐의추측 {

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
			
			int caseNum = Integer.parseInt(br.readLine());
			
			int p1 = caseNum / 2;
			int p2 = caseNum - p1;
			
			while(true) {
				
				if(primeSet[p1] == true && primeSet[p2] == true) {
					System.out.println(p1 + " " + p2);
					break;
				}
				else {
					p1--;
					p2++;
					
				}
			}
		}
	}
}