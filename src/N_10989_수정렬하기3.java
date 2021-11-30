import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class N_10989_수정렬하기3 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 케이스 수 입력받기 
		int cases = Integer.parseInt(br.readLine());
		
		// 길이가 case인 배열에 값 옮겨담기
		int [] arr = new int[cases];
		
		// 반복문을 활용하여 배열에 수를 입력한다.
		for(int i = 0; i < cases; i ++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// Array.sort를 활용해 정렬한다.
		Arrays.sort(arr);
		
		// StringBuilder를 활용해 결과를 빠르게 출력한다.
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < cases; i ++) {
			sb.append(arr[i]).append('\n');
		}
		
		System.out.println(sb);
	}
}
