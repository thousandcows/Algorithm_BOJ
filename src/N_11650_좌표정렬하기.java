import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N_11650_좌표정렬하기 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int coordinates = Integer.parseInt(br.readLine()); 
		
		// 2차원 배열 선언
		int [][] arr = new int[coordinates][2];
		
		// StringTokenizer로 2차원 배열 입력하기
		StringTokenizer st;
		
		for(int i = 0; i < coordinates; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 람다식을 활용해 Arrays.sort로 정렬하기
		Arrays.sort(arr, (e1, e2) -> {
			// x좌표가 같은 경우
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			}
			// x좌표가 다른 경우
			else {
				return e1[0] - e2[0];
			}
			
		});
		
		// StringBuilder로 결과 출력
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < coordinates; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}
