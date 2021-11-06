import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class N_10757_큰수AB {
	
	public static void main(String[] args) throws IOException {
		
		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// A와 B 입력받기
		String [] numbers = br.readLine().split(" ");
		
		// A와 B BigInteger형으로 바꾸기
		BigInteger num1 = new BigInteger(numbers[0]);
		BigInteger num2 = new BigInteger(numbers[1]);
		
		// 결과 출력
		BigInteger result = num1.add(num2);
		
		System.out.println(result);
		
	}
}
