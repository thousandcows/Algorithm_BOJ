import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_17478_재귀함수가뭔가요 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// java.io.BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 횟수 입력받기
		int number = Integer.parseInt(br.readLine());
		
		// 배열 생성해서 문장 담기
		String [] arr = new String[7];
		
		arr[0] = "\"재귀함수가 뭔가요?\"";
		arr[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
		arr[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
		arr[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		arr[4] = "\"재귀함수가 뭔가요?\""; // 최대 횟수만
		arr[5]= "\"재귀함수는 자기 자신을 호출하는 함수라네\""; // 최대 횟수만
		arr[6] = "라고 답변하였지."; // 횟수 줄어듦
		
		// 결과 출력
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		recursive(number, arr);
	}
	public static String underline = "";
	
	// 재귀함수란 무엇인가 메서드
	private static void recursive(int number, String [] arr) {
		
		String dots = underline;

		// 0이 되면 출력한 뒤 재귀함수 종료(return)
		if(number == 0) {

			System.out.println(dots + arr[4]);
			System.out.println(dots + arr[5]);
			System.out.println(dots + arr[6]);
			return;

		} 
		
		// 0이 아닌 경우 재귀로 반복할 내용
		System.out.println(dots + arr[0]);
		System.out.println(dots + arr[1]);
		System.out.println(dots + arr[2]);
		System.out.println(dots + arr[3]);
		
		// 반복될 때마다 앞에 underline 추가
		underline += "____";

		recursive(number-1, arr);
		
		// 재귀를 빠져나오면서 underline이 긴 문장부터 출력(라고 답변하였지)
		System.out.println(dots + arr[6]);
		
	}
}

