import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.StringTokenizer;

public class Aa {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 1. Read N and numbers
		int N = Integer.parseInt(br.readLine());

		// 2. Put numbers and its count in HashMap
		Map<String, Integer> map = new HashMap<String, Integer>();
		LinkedList<Integer> list = new LinkedList();
		Stack<Integer> stack = new Stack();
		
		String numbers = br.readLine();
		
		StringTokenizer st = new StringTokenizer(numbers, " ");
			
		String num = "";
		while(st.hasMoreTokens()) {
				
			num = st.nextToken();
			
			if(map.containsKey(num)) {
				
				map.replace(num, map.get(num) + 1);
				
			}else {
				
				map.put(num, 1);
				
			}
		}
		
		st = new StringTokenizer(numbers, " ");
		for(int i = 0; i < N; i ++) {
			num = st.nextToken();
			list.add(map.get(num));
		}
		
		for(Entry<String, Integer> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
		}
		
		for(Integer i : list) {
			System.out.println(i + " : ");
		}
	}
}
