import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class N_2751_수정렬하기2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 케이스 수 입력받기
		int cases = Integer.parseInt(br.readLine());

		// ArrayList 
		ArrayList<Integer> list = new ArrayList<>();

		// 배열에 int 값으로 입력 값 저장
		for(int i = 0; i < cases; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		// 오름차순으로 정렬
		Collections.sort(list);
		
		// String Builder를 활용하여 결과 출력
		
		StringBuilder sb = new StringBuilder();
		
		for(int num : list) {
			sb.append(num).append('\n');
		}
		
		System.out.println(sb);
	}
}
