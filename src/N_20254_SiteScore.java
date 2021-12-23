import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_20254_SiteScore {
	public static void main(String[] args) throws IOException {
		
		// import java.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// StringTokenizer
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// allocate values to the variables
		int ur = Integer.parseInt(st.nextToken());
		int tr = Integer.parseInt(st.nextToken());
		int uo = Integer.parseInt(st.nextToken());
		int to = Integer.parseInt(st.nextToken());
		
		// calculate the score
		int score = 56 * ur + 24 * tr + 14 * uo + 6 * to;
		
		System.out.println(score);
	}
}
