import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj17087 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 1. Read N, S, As
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		long S = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
        long maxD;
		// 2-1. If N == 1
		if(N == 1) {
			// 3-1. Find maxD
			maxD = Math.abs(S - Long.parseLong(st.nextToken()));
			
			// 4-1. Print the answer
			System.out.println(maxD);
			return;
		}else {
			// 2-2. Put Ds to array
			long [] distances = new long[N];
			
			for(int i = 0; i < N; i++) {
				distances[i] = Math.abs(S - Long.parseLong(st.nextToken()));
			}
			
			// 3-2. Find max D (finding GCD of distances)
			maxD = findMaxD(distances[0], distances[1]);
			
			// the answer should be Greatest Common Disisor of all Ds
			for(int i = 2; i < N ; i++) {
				maxD = findMaxD(maxD, distances[i]);
			}
			
			// 4-2. Print the answer
			System.out.println(maxD);
		}
	}
	
	public static long findMaxD(long a, long b) {
		if(a % b == 0) {
			return b;
		}else {
			return findMaxD(b, a % b);
		}
	}
}