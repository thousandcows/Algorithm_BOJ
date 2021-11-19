import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1002_터렛 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트케이스 입력받기
		int cases = Integer.parseInt(br.readLine());

		// 테스트 케이스만큼 위치 개수 계산하기
		for(int i = 0; i < cases; i++) {
			
			// import java.util.StringTokenizer
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());

			// 원과 원 사이의 거리
			int distance = (int)(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

			// 1. 접점의 개수가 무한일 때
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			}

			// 2.접점이 0개인 경우

			// 2-1. : 원이 접하지 않는 포함관계인 경우
			else if(distance < Math.pow(r1-r2, 2)) {

				System.out.println(0);
			} 

			// 2-2. : 두 점 사이의 거리가 반지름의 갑보다 클 때
			else if(distance > Math.pow(r1 + r2, 2)) {

				System.out.println(0);
			}

			// 3. 접점이 1개인 경우
			// 3-1. 두 원점 사이의 거리가 두 원 반지름 길이 차이와 같을 때
			else if(distance == Math.pow(r1-r2, 2)) {
				System.out.println(1);
			}
			
			// 3-2. 두 원이 한 점에서 외접할 때
			else if(distance == Math.pow(r1 + r2, 2)) {
				System.out.println(1);
			}

			// 접점이 2개인 경우
			else {
				System.out.println(2);
			}
		}
	}
}