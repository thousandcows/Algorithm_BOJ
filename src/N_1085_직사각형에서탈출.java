import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1085_직사각형에서탈출 {

	public static void main(String[] args) throws NumberFormatException, IOException {
			
		// java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		// x, y, w, h 배열을 활용해 받아주기
			String [] numbers = br.readLine().split(" ");
			int x = Integer.parseInt(numbers[0]);
			int y = Integer.parseInt(numbers[1]);
			int w = Integer.parseInt(numbers[2]);
			int h = Integer.parseInt(numbers[3]);
			
			// 결과 출력
			int min = minDistance(x,y,w,h);
					
			System.out.println(min);
		}
		
	// 최소거리 구하는 메서드
	private static int minDistance(int x, int y, int w, int h) {
		
		// 4가지 경우 각각 독립적으로 비교해주어야 한다!
		int min = x;
		
		if(min > y) {
			min = y; 
		}
		if (min > w - x) {
			min = w - x;
		}
		if (min > h - y) {
			min = h - y;
		}
		return min;
	}
}