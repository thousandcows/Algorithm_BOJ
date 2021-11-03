

import java.util.Scanner;

public class N_10818_최소최대 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// n개의 정수 받기
		int number = scan.nextInt();
		
		// 배열 선언하고 각 요소에 값 저장하기
		int [] intArray = new int [number];
		
		for(int i = 0; i < intArray.length; i ++) {
			intArray[i] = scan.nextInt();
		}
		
		// 최솟값 구하기
		int min = minOf(intArray);
		
		// 최댓값 구하기
		int max = maxOf(intArray);
		
		// 출력
		System.out.println(min + " " + max);
	}
	// 최솟값 구하는 메서드
	static int minOf(int [] a) {
		int min = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] < min) min = a[i];
		}return min;
	}
	// 최댓값 구하는 메서드
	static int maxOf(int [] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) max = a[i];
		}return max;
	}
}
