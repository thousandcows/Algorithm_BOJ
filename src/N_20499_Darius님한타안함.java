import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_20499_Darius님한타안함 {

	public static void main(String[] args) throws IOException {

		// import java.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// StringTokenizer
		StringTokenizer st = new StringTokenizer(br.readLine(),"/");

		// allocate values to the variables
		int K = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());

		// calculate the score

		int ka = K + A;
		if(ka < D || D == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}

	}
}
