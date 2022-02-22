import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2609 {
	public static void main(String[] args) throws IOException {
		
		// 1. Read two numbers
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 2. Calculate the answer
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		// if num1 == num2
		if(num1 == num2) {
			System.out.println(num1 + "\n" + num1);
			return;
		}
		
		// a. Greatest Common Divisor
		int gcd = findGcd(num1, num2);
		
		// b. Least Common Multiple : num1 * num2 / Greatest Common Divisor
		int lcm = num1 * num2 / gcd;
		
		// 3. Print the answer
		System.out.println(gcd + "\n" + lcm);
	}

	private static int findGcd(int num1, int num2) {
		int small;
		int large;
		int answer;
		
		if(num1 > num2) {
			small = num2;
			large = num1;
		}else {
			small = num1;
			large = num2;
		}
		
		int remainder; 
		while(true) {
			remainder = large % small;
			
			if(remainder == 0) {
				answer = small;
				break;
				
			}else {
				large = small;
				small = remainder;
			}
		}
		return answer;
	}
}