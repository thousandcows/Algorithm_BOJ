import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj3085 {

    public static int N;
    public static char[][] board;
    public static int maxValue = 0;

    public static void check(char[][] board) {
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 0; j < N - 1; j++) {
                if (board[i][j] == board[i][j + 1]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                maxValue = Math.max(maxValue, cnt);
            }
        }
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 0; j < N - 1; j++) {
                if (board[j][i] == board[j + 1][i]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                maxValue = Math.max(maxValue, cnt);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 1. Read the board
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        board = new char[N][N];


        for (int i = 0; i < N; i++) {

            String row = br.readLine();

            for (int j = 0; j < N; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        // 2. Find the maximum number of candy
        // a. direction: left to right
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                char swap = board[i][j];
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = swap;

                check(board);

                swap = board[i][j];
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = swap;
            }
        }

        // b. direction: top to bottom
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                char swap = board[j][i];
                board[j][i] = board[j + 1][i];
                board[j + 1][i] = swap;

                check(board);

                swap = board[j][i];
                board[j][i] = board[j + 1][i];
                board[j + 1][i] = swap;
            }
        }

        // 3. Print the answer
        System.out.println(maxValue);
    }


}
