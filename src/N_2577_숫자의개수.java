

import java.util.Scanner;

public class N_2577_숫자의개수 {
	
	// 비교할 static 배열 생성하기
	static int [] numList = new int [10];
	
	// 0 ~ 9까지 숫자가 몇 개 있는지 알아내는 메서드 생성
	static void compareDigits(int value) {
		String strValue = String.valueOf(value);
		String [] valArray = strValue.split("");
		int [] intArray = new int[valArray.length];
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(valArray[i]);
		}
		
		for(int i = 0; i < numList.length; i++) {
			for(int j = 0; j < intArray.length; j++) {
				if(intArray[j] == i) {
					numList[i]++;
				}
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 자연수 3개 입력받기
		int intVal1 = scan.nextInt();
		int intVal2 = scan.nextInt();
		int intVal3 = scan.nextInt();

		// 자연수 3개의 곱 계산하기
		int multipliedVal = intVal1 * intVal2 * intVal3;
		
		
		// 0 ~ 9까지 숫자가 몇 개 있는지 알아내기
		compareDigits(multipliedVal);
		
		// 결과 출력하기
		for(int i = 0; i < numList.length; i++) {
			System.out.println(numList[i]);
		}
	}
}
