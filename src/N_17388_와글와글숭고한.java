import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_17388_와글와글숭고한 {

	public static void main(String[] args) throws IOException {

		// import java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// StringTokenizer
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// Parse numbers with StringTokenizer
		int S = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int total = S + K + H;
		
		// Print result
		if(total >= 100) {
			System.out.println("OK");
		}else {
			System.out.println(printMin(S,K,H));
		}
	}

	private static String printMin(int s, int k, int h) {
		int min = s;
		String result = null;
		
		if(s < k && s < h) {
			result = "Soongsil";
		}else if(k < s && k < h) {
			result = "Korea";
		}else {
			result = "Hanyang";
		}
		return result;
	}
}
