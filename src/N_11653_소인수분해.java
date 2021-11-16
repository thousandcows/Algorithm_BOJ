import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_11653_소인수분해 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 정수 N 입력받기
		int number = Integer.parseInt(br.readLine());
		
		// StringBuilder 활용
		StringBuilder sb = new StringBuilder();
		
		/*제곱근의 성질을 활용하면 i * i <= number 인 상황까지만 탐색해도 됨
		예: number가 16인 경우 곱셈으로 분해하면 
		1 * 16, 2 * 8, 4 * 4, 8 * 2, 16 * 1로 대칭적인 구조를 가지고 있음*/
			
		for(int i = 2; i * i <= number; i++) {
			while(number % i == 0) {
				sb.append(i).append('\n');
				number /= i;
			}
		}
		
		/*
		 * 위 방식을 이용할 경우 나머지가 발생할 수 있는데, 이때 나머지는 반드시 1개의 소수이다.
		 * 10을 예로 들면 위의 for문에서 2가 출력되는 반면 5는 걸러지지 않는다.
		 * 따라서 입력한 수가 1이 아니라면 그 수가 소수인 나머지다.*/
		if(number != 1) {
			sb.append(number);
		}
		
		// 결과 출력
		System.out.println(sb);
	}
}