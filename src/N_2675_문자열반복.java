import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2675_문자열반복 {

	public static void main(String[] args) {
		
		//import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int caseNum;
		try {
			// 테스트 케이스 개수 받기
			caseNum = Integer.parseInt(br.readLine());
			
			// 각 테스트 케이스에서 P를 출력한다.
			for (int i = 0; i < caseNum; i ++) {
				
				String [] str = br.readLine().split(" ");
				
				int times = Integer.parseInt(str[0]);
				String [] wordArr = str[1].split("");
				
				for (int j = 0; j < wordArr.length; j++) {
					for(int k = 0; k < times; k ++) {
						System.out.print(wordArr[j]);
					}
				}System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}