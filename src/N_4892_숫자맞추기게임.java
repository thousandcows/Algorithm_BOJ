import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_4892_숫자맞추기게임 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// java.io.util.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스 = 0이 될 때 까지 출력
		int count = 1;
		
		while(true) {
			
			// 케이스 입력
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			// n1(n * 3)이 짝수, 홀수 판단
			String n1 = "";
			int n4 = 0;
			
			if (n % 2 == 0) {
				n1 = "even";
				n4 = 3*((n * 3)/2)/9;
			} else {
				n1 = "odd";
				n4 = 3*((n * 3 + 1)/2)/9;
			}
			
			// 결과 출력
			System.out.println(count + ". " + n1 + " " + n4);
			
			// 개수 세기
						count++;
			
		}
	}
}
