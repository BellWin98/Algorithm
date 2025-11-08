import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] board = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'W') {
                    board[i][j] = true;
                }
            }
        }
        br.close();
        int row = N - 7;
        int col = M - 7;
        int min = 64; // 체스판 크기가 8 * 8
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int endX = i + 8;
                int endY = j + 8;
                boolean TF = true;
                int count = 0;
                for (int k = i; k < endX; k++) {
                    for (int l = j; l < endY; l++) {
                        if (board[k][l] != TF) {
                            count++;
                        }
                        TF = !TF;
                    }
                    TF = !TF;
                }
                // 좌측 최상단 정사각형이 흰색인 경우와 흑색인 경우 중 칠해야하는 갯수가 작은 것
                count = Math.min(count, 64 - count); 
                min = Math.min(min, count);
            }
        }
        bw.write(min + "\n");
        bw.flush();
        bw.close();
    }
}