import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2750_수정렬하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 숫자 개수 받기
		int numbers = Integer.parseInt(br.readLine());

		// 정렬하기 위한 배열 선언
		int [] intArray = new int [numbers];

		// 배열에 값 입력
		for(int i = 0; i < numbers; i ++) {

			intArray[i] = Integer.parseInt(br.readLine());

		}

		// 버블정렬 실행
		bubbleSort(intArray);

		// 중복 값 제거 후 출력하기
		for(int i = 0; i < numbers; i ++) {
			if(i == 0) {
				System.out.println(intArray[0]);
			}
			else{
				if(intArray[i] != intArray[i-1]) {
					System.out.println(intArray[i]);
				}
			}
		}
	}
	// 버블정렬 메서드
		public static void bubbleSort(int [] array) {

			for(int i = array.length -1 ; i > 0; i--) {
				for(int j = 0; j < i; j++) {
					if(array[j] > array[j+1]) {
						int tmp = array[j];
						array[j] = array[j+1];
						array[j+1] = tmp;
					}
				}
			}

		}
}