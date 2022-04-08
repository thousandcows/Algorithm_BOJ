import java.io.*;

public class Boj1789 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 1. Read S
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long s = Long.parseLong(br.readLine());

		// 2. Find max N
		long total = 0;
		int cnt = 0;

		for(int i = 1; ; i++) {
			
			if(total > s) {
				break;
			}
			total += i;
			cnt ++;
		}

		// 3. Print N
		System.out.println(cnt - 1);
	}

}
