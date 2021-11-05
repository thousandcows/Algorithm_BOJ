import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2475_검증수 {

	public static void main(String[] args) throws IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 고유번호 입력받기
		String [] serial = br.readLine().split(" ");
		int total = 0;
		int finalNum = 0;
		
		for(int i = 0; i < 5; i++) {
			int num = Integer.parseInt(serial[i]);
			total += num * num;
			finalNum = total%10;
		}
		
		// 검증수 출력
		System.out.println(finalNum);
	}
}