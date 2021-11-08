import java.util.Scanner;

public class N_10250_ACM호텔 {
	
	public static void main(String[] args) {
		
		// import java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		// 테스트 케이스 받기
		int testCase = scan.nextInt();
		
		// 
		for(int i = 0; i < testCase; i++) {
			
			// H, W, N 값 받기
			int height = scan.nextInt();
			int width = scan.nextInt();
			int guestNumber = scan.nextInt();
			
			// 배정될 방 번호 출력하기
			String roomNumber = getRoomNumber(height, width, guestNumber);
		
			System.out.println(roomNumber);
		}
	}

	private static String getRoomNumber(int height, int width, int guestNumber) {
		
		// 총 객실 수 길이 만큼의 배열 생성
		String [] roomList = new String [height*width];
		
		// 객실 수 세기
		int index = 0;
		
		// 배정되는 객실 순서대로 값을 배열에 입력하기
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= height; j++) {
				roomList[index] = Integer.toString(j * 100 + i) ;
				index++;
			}
		}
		// 손님 객실 번호 리턴
		return roomList[guestNumber-1];
	}
}