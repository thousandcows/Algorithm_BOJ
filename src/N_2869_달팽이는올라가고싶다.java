import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2869_달팽이는올라가고싶다 {

	public static void main(String[] args) throws IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// A, B, V 받기
		String [] infoArr = br.readLine().split(" ");

		int A = Integer.parseInt(infoArr[0]);
		int B = Integer.parseInt(infoArr[1]);
		int V = Integer.parseInt(infoArr[2]);

		// 올라가는데 걸리는 기간 출력
		double days = Math.ceil((double)(V-A)/(A-B)) + 1;
		System.out.println((int)days);
	}
}
