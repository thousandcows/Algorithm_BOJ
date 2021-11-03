

import java.util.Scanner;

public class N_10871_x보다작은수 {
	
	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// N과 X 입력받기
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		// 길이가 N인 int형 배열 선언
		int [] intArray = new int[N];
		
		// intArray에 수열 저장하기
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
		}
		
		// x보다 작은 수 출력하기
		printSmallerThanX(intArray, X);
		
	}
	// x보다 작은 수 출력하는 메서드
	private static void printSmallerThanX(int[] intArray, int x) {
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] < x) {
				System.out.print(intArray[i] + " ");
			}
		}
	}
}