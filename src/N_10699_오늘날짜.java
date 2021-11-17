import java.text.SimpleDateFormat;
import java.util.Calendar;

public class N_10699_오늘날짜 {
	
	public static void main(String[] args) {
		
		// import java.text.SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		// import java.util.Calendar
		Calendar c = Calendar.getInstance();
		
		// 시간을 받아 정해진 format으로 변환
		String today = sdf.format(c.getTime());
		
		// 결과 출력
		System.out.println(today);
		
	}
}
