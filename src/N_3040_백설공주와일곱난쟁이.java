import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_3040_백설공주와일곱난쟁이 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 크기 9인 배열에 수 담기
		int [] arr = new int[9];
		
		int target = 0;
		
		for(int i = 0; i < 9; i ++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			target += arr[i];
		}
		
		
		// 전체 수의 합 - 임의의 두 수의 합 == 100이 될 때까지 반복문 실행
		Loop1:
		for(int i = 0; i < 8; i ++) {
			Loop2:
			for(int k = i + 1; k < 9; k++) {
					
					if(target - (arr[i] + arr[k]) == 100) {
						arr[i] = arr[k] = 0;
						break Loop1; 
						// break 해주지 않으면 2보다 많은 배열 요소값이 0이 될 수 있음
					}
				}
			}
		
		// 결과 출력
		for(int i : arr) {
			if(i != 0) {
				System.out.println(i);
			}
		}
	}
}
