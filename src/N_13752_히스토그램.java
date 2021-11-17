import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class N_13752_히스토그램 {

		public static void main(String[] args) throws NumberFormatException, IOException {
			
			// import java.io.BufferedReader
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			// 테스트 케이스 입력받기
			int cases = Integer.parseInt(br.readLine());
			
			// 케이스만큼 결과 출력하기
			for(int i = 0; i < cases; i ++) {
				
				int sizeK = Integer.parseInt(br.readLine());
				
				for(int j = 0; j < sizeK; j ++) {
					System.out.print("=");
				}
				System.out.println();
			}
		}
}