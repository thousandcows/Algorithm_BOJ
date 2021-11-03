import java.util.Scanner;

public class N_2052_나머지 {

	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// 길이 10인 배열을 선언한다.
		int [] intArray = new int[10];
		
		// 수 10개를 입력받는다.
		for(int i = 0; i < 10; i ++) {
			intArray[i] = scan.nextInt();
		}
		
		// 42로 나눈 나머지 개수를 확인해 주는 함수
		int count = netRemainsCount(intArray);
		
		// 결과 출력
		System.out.println(count);
	}
	
	// 42로 나눈 나머지로 배열을 생성해주는 함수
	private static int [] remainsArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = intArray[i]%42;
		}
		
		return intArray;
	}
	
	// 순 나머지 개수 계산해주는 함수
	private static int netRemainsCount(int[] intArr) {
		int [] intArray = new int[intArr.length];
		
		intArray = remainsArray(intArr);
		
		int count = 1;
		for(int i = 0; i < intArray.length-1; i++) {
			for(int j = i+1; j < intArray.length; j++) {
				if(intArray[i] == intArray[j]) {
					break;
				}
				if(j == intArray.length-1) {
					count++;
				}
			}
		}
		return count;
	}
}