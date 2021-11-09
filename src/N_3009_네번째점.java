
import java.util.Scanner;

public class N_3009_네번째점 {

	public static void main(String[] args) {

		// java.util.Scanner
		Scanner scan = new Scanner(System.in);

		// 크기 8짜리 배열 선언
		int [] pointArr = new int [6];

		// x축 좌표는 짝수번째, y축 좌표는 홀수번째 배열 index에 저장한다.
		for(int i = 0; i < pointArr.length; i++) {
			pointArr[i] = scan.nextInt();
		}
		

		// x, y 좌표 찾아 출력하기
		String point = pointOf(pointArr);
		System.out.print(point);
	}
	
	// 좌표 찾기 메서드
	private static String pointOf(int[] array) {
		int x = 0;
		int y = 0;
		
		// x,y축 모두와 평행하려면 x,y 좌표값 모두 각각 2개씩 같은 값으로 묶을 수 있어야 한다.
		
		// x 좌표 구하기 
		if(array[0] != array[2] && array[0] != array[4]) {
			x = array[0];
		}else if(array[0] == array[2]) {
			x = array[4];
		}else if(array[0] != array[2]) {
			x = array[2];
		}

		// y 좌표 구하기
		if(array[1] != array[3] && array[1] != array[5]) {
			y = array[1];
		}else if(array[1] == array[3]){
			y = array[5];
		}else if(array[1] != array[3]){
			y = array[3];
		}
		return x + " " + y;
	}
}