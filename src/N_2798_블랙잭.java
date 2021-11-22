import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N_2798_블랙잭 {

	public static int M;

	public static void main(String[] args) throws IOException {

		// import java.util.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// import java.util.StringTokenizer
		String conditions = br.readLine();

		StringTokenizer st = new StringTokenizer(conditions, " ");

		// 카드 개수(N)과 목표값(M) 입력받기
		int N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		// 개수가 N인 배열 생성 후 입력된 수 담기
		int [] arr = new int[N];

		st = new StringTokenizer(br.readLine(), " ");

		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}

		// 카드 3장의 합 출력하기
		int total  = 0;
		int temp = 0;
		Loop1:
		for(int i = 0; i < N - 2; i++) {
			if(arr[i] > M) continue;
			Loop2:
			for(int j = i + 1; j < N - 1; j++) {
				if(arr[i] + arr[j] > M) continue;
				Loop3:
				for(int k = j + 1; k < N; k++) {

					temp = arr[i] + arr[j] + arr[k];

					if(temp == M) {
						total = temp;
						break Loop1;
					}
					
					if(total < temp && temp < M) {
						total = temp;
					}
				}
			}
		}
		System.out.println(total);
	}
}