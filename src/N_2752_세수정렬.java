import java.util.Scanner;

public class N_2752_세수정렬 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int [] intArr = new int[3];
		intArr[0] = scan.nextInt();
		intArr[1] = scan.nextInt();
		intArr[2] = scan.nextInt();

		sort(intArr);

		for(int i = 0; i < 3; i++) {
			System.out.print(intArr[i] + " ");
		}


	}

	private static void sort(int [] array) {
		int tmp = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {

				if(array[j] > array[j+1]) {
					tmp = array[j+1];
					array[j+1] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
}