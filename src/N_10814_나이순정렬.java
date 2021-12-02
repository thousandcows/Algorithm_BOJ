import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class N_10814_나이순정렬 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 회원 수 입력받기
		int members = Integer.parseInt(br.readLine());
		
		// String type의 2차원 배열 생성
		String [][] arr = new String [members][2];
		
		
		for(int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		// Arrays.sort로 정렬하기
		Arrays.sort(arr, new Comparator<String[]>() {
			
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		
		
		// StringBuilder를 활용해 출력하기
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i][0] + " " + arr[i][1] + '\n');
		}
		System.out.println(sb);
		
	}
}
