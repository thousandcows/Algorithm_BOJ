import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_3053_택시기하학 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 반지름 입력받기
		double R = Double.parseDouble(br.readLine());
		
		// 원의 넓이 출력하기
		
		//1. 유클리드 기하학
		System.out.println(Math.PI * R * R);
		
		//2. 택시 기하학
		System.out.println(2 * R * R);
	}
}
