import java.util.Scanner;

public class N_1316_그룹단어체커 {

	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// 단어 개수 입력받기
		int wordNum = Integer.parseInt(scan.nextLine());
		
		// 그룹단어 개수 출력하기
		int count = 0;
		
		for(int i = 0; i < wordNum; i ++) {
			
			String word = scan.nextLine();
			
			if(isGroupWord(word)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

	private static boolean isGroupWord(String word) {
		
		boolean test = true;
		
		String [] arr = word.split("");

		for (int i = 1; i < arr.length-1; i++) {
			
			if (!arr[i+1].equals(arr[i])) {
				for(int j = 0; j < i+1; j++) {
					if(arr[i+1].equals(arr[j])) {
						test = false;
						break;
					}
				}
			}
		}
		return test;
	}
}