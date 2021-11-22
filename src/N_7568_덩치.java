import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_7568_덩치 {

	public static void main(String[] args) throws Exception {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 사람 수 받아주기
		int people = Integer.parseInt(br.readLine());

		// 키, 몸무게 값을 저장할 2차원 배열 생성
		int [][] array = new int [people][2];

		// StringTokenizer를 활용해 배열 값 입력
		for(int i = 0; i < people; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());

		}
		
		// import StringBuilder
		StringBuilder sb = new StringBuilder();
		
		// 대소비교가 확실하게 될 때에만 rank를 1씩 올려준다.
		// 그렇게 한다면 등수가 같은 사람은 자연스럽게 같은 rank 값을 갖게 된다.
		for(int i = 0; i < people; i++) {
			
			int rank = 1;
			
			for(int j = 0; j < people; j++) {
				
				if(i == j) continue;
				
				if(array[i][0] < array[j][0] && array[i][1] < array[j][1]) {
					rank++;
				}
			}
			sb.append(rank + " ");
		}
		// 결과 출력
		System.out.println(sb);
	}
}