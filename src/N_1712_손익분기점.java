import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1712_손익분기점 {

	public static void main(String[] args) throws IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 고정비, 가변비, 가격 입력받기
		String [] numbers = br.readLine().split(" ");

		int fixedCost = Integer.parseInt(numbers[0]);
		int addedCost = Integer.parseInt(numbers[1]);
		int price = Integer.parseInt(numbers[2]);

		// 손익분기점 계산하기
		double breakEvenPoint = 0; // count가 int의 범위 넘어가는 경우 고려
		int marginalBenefit = price - addedCost;

		// 1. 손익분기점을 넘어설 가능성이 없는 경우
		if (price <= addedCost) {
			System.out.println(-1);
		} 
		// 2. 손익분기점 넘길 수 있는 경우
		else {
			breakEvenPoint = (fixedCost / marginalBenefit) + 1;
			// (고정비 / 한계편익) + 1 
			System.out.println((int)breakEvenPoint);
		}
	}
}