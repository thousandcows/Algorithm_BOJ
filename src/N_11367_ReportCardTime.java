import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_11367_ReportCardTime {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// import java.io.BufferedREader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Read the test case
		int cases = Integer.parseInt(br.readLine());
		
		// Read every hobbits name and grade
		String [][] grades = new String[cases][2];
		
		for(int i = 0; i < cases; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			int numericalGrade = Integer.parseInt(st.nextToken());
			String grade = calculateGrade(numericalGrade);
			
			grades[i][0] = name;
			grades[i][1] = grade;
		}
		
		// Print result
		for(int i = 0; i < cases; i++) {
			System.out.println(grades[i][0] + " " + grades[i][1]);
		}
	}

	private static String calculateGrade(int score) {
		String grade = "F";
		
		if(score >= 97) {
			grade = "A+";
		}else if(score >= 90 && score <= 96) {
			grade = "A";
		}else if(score >= 87 && score <= 89) {
			grade = "B+";
		}else if(score >= 80 && score <= 86) {
			grade = "B";
		}else if(score >= 77 && score <= 79) {
			grade = "C+";
		}else if(score >= 70 && score <= 76) {
			grade = "C";
		}else if(score >= 67 && score <= 69) {
			grade = "D+";
		}else if(score >= 60 && score <= 66) {
			grade = "D";
		}
		return grade;
	}
}
