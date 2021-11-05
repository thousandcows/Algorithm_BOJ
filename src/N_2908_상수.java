import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2908_상수 {

	public static void main(String[] args) throws IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 두 수 받기
		String [] numbers = br.readLine().split(" ");

		// 반복문으로 두 수 순서 바꾸기

		int num1 = reverse(Integer.parseInt(numbers[0]));
		int num2 = reverse(Integer.parseInt(numbers[1]));

		// 두 수 중에서 큰 수 출력
		if (num1 > num2) {
			System.out.println(num1);
		} else	System.out.println(num2);

	}
	
	// 두 수를 바꿔주는 메서드
	static int reverse(int number) {

		int reverseNum = 0;
		while(number != 0) {
			int remain = number % 10;
			reverseNum = reverseNum*10 + remain;
			number = number/10;
		}
		return reverseNum;

	}
}
