
public class N_4673_셀프넘버 {

	public static void main(String[] args) {

		int number = 1;

		do {

			// 셀프넘버면 출력하기
			if(isSelfNumber(number)) {
				System.out.println(number);
			} number++;

		} while(number <= 10000);

	}

	// 셀프넘버인지 판단하는 메서드
	static boolean isSelfNumber(int number) {
		boolean isSelfNumber = false;


		for (int i = 0; i < number; i++) {

			// 예비 생성자 값과 비교하기
			if (constructor(i) == number) {
				isSelfNumber = false;
				break;
			} else {
				isSelfNumber = true;
			}
		}
		return isSelfNumber;
	}

	// 1 이상 selfNum 미만인 숫자들을 생성자 형식으로 만들어 반환하는 메서드
	static int constructor(int i) {

		int Constructor = i;

		while(i > 0) {
			Constructor += i % 10;
			i /= 10;
		}
		return Constructor;
	}
}
