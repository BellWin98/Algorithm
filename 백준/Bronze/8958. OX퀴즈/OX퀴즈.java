import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String quizResult = br.readLine();
            int score = 0;
            int streak = 0;
            for (char c : quizResult.toCharArray()) {
                if (c == 'O') {
                    streak++;
                    score += streak;
                } else {
                    streak = 0;
                }
            }
            bw.write(score + "\n");
        }
        bw.flush();
        bw.close();
    }
}