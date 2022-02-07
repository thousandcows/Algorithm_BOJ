import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1018_체스판다시칠하기 {
	
	public static void main(String[] args) throws IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// StringTokenizer로 숫자 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int height = Integer.parseInt(st.nextToken()); 
		int width = Integer.parseInt(st.nextToken()); 
		
		// 8 * 8을 추출해? -> index 옮겨가면서 8 * 8만큼씩 2차원 배열 값으로 비교
		// 비교한 다음에 
		
		// 바꿔야 하는 개수 : 0 부터 ++ 하면서 조회
		
	}
}
