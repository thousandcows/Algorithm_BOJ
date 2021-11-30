import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1427_소트인사이드 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// import.java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 수 입력받기
		String [] number = br.readLine().split(""); 
		int [] digits = new int[number.length];
		
		for(int i = 0; i < digits.length; i++) {
			digits[i] = Integer.parseInt(number[i]);
		}
		
		// 버블정렬로 내림차순 정렬하기
		for(int i = digits.length-1; i >= 0; i--) {
			
			for(int j = 0; j < i; j++) {
				// 두 수가 같은 경우 continue;
				if(digits[i] == digits[j]) continue;
				
				// 앞 자리가 뒷 자리보다 작은 경우 경우 자리 바꿔주기
				else if (digits[i] > digits[j]) {
					int tmp = digits[i];
					digits[i] = digits[j];
					digits[j] = tmp;
				}
			}
		}
		
		// StringBuilder를 활용해 결과 출력
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < digits.length; i++) {
			sb.append(digits[i]);
		}
		System.out.println(sb);
	}
}
