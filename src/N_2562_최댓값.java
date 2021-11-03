

import java.util.Scanner;

public class N_2562_최댓값 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		// 크기 9인 배열 선언하고 각 요소에 값 저장하기
		int [] intArray = new int [9];

		for(int i = 0; i < intArray.length; i ++) {
			intArray[i] = scan.nextInt();
		}


		// 최댓값 및 인덱스 구하기
		int max = maxOf(intArray);

		// 출력
		System.out.println(max);
		System.out.println(maxIndex);
	}

	// 최댓값 구하는 메서드
	static int maxIndex;
	static int maxOf(int [] a) {
		int max = a[0];
		maxIndex = 1; // max가 0번째 수인 경우도 고려해야 한다!

		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
				maxIndex = i + 1;
			}
		}return max;
	}
}
