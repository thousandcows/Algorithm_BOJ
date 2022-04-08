import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_7891_CanYouAddThis {
	
	public static void main(String[] args) throws IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 케이스 입력받기
		int cases = Integer.parseInt(br.readLine());
		
		// 케이스 수 만큼 합 계산하기
		for(int i = 0; i < cases; i++) {
			
			// import java.util.StringTokenizer
			// 공백을 기준으로 문자열 분리
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int numOne = Integer.parseInt(st.nextToken());
			int numTwo = Integer.parseInt(st.nextToken());
			
			// 결과 출력
			System.out.println(numOne + numTwo);
			
		}
	}
}