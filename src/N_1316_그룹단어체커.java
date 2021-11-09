import java.util.Scanner;

public class N_1316_그룹단어체커 {

	public static void main(String[] args) {

		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);

		// 단어 개수 입력받기
		int wordNum = Integer.parseInt(scan.nextLine());

		// 그룹단어 개수 출력하기
		int count = 0;

		for(int i = 0; i < wordNum; i ++) {

			String word = scan.nextLine();

			if(isGroupWord(word)) {
				count++;
			}
		}

		System.out.println(count);
	}

	// 그룹단어인지 확인하는 메서드
	private static boolean isGroupWord(String word) {

		// 기본값은 true로 설정한다
		boolean test = true;

		// 매개변수로 받은 값을 쪼개서 배열에 담는다
		String [] arr = word.split("");

		for (int i = 1; i < arr.length-1; i++) {
			// i+1번째 있는 값이 i번째 값과 다를때			
			if (!arr[i+1].equals(arr[i])) {
				// i+1 번째 값이 0 ~ i번째 값과 같은 경우 false를 반환한다.
				for(int j = 0; j < i; j++) {
					if(arr[i+1].equals(arr[j])) {
						test = false;
						break;
					}
				}
			}
		}
		return test;
	}
}