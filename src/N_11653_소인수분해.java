import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_11653_소인수분해 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 정수 N 입력받기
		int number = Integer.parseInt(br.readLine());

		// 소인수분해 실행
		int [] primeSet = primeSet(number);
		
		for(int i = 0; i < primeSet.length; i++) {
			
			if(primeSet[i] >= 2 && number % primeSet[i] == 0){ 
			
				System.out.println(i);
				number /= i;
				i--;
			}
		}
	}

	// N 미만의 소수를 담는 배열을 생성하는 메서드
	public static int [] primeSet (int number) {

		// 에라토스테네스의 체
		int [] primeSet = new int [number+1];

		for(int i = 0; i < primeSet.length; i++) {
			primeSet[i] = i;
		}

		primeSet[0] = primeSet[1] = 0;

		for (int i = 2; i*i < number; i ++) {

			// 이미 0인 값은 다음 반복문으로 통과
			if(primeSet[i] == 0) {
				continue;
			}

			// i의 배수들을 지우는 반복문
			for(int j = i*i; j < primeSet.length; j += i) {
				primeSet[j] = 0;
			}
		}
		return primeSet;
	}
}