import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[N];
        int i = 0;
        while (st.hasMoreTokens()) {
            scores[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        System.out.println(solution(scores));
    }

    static double solution(int[] scores) {
        int M = Integer.MIN_VALUE;
        double sumOfScores = 0.0;
        for (int score : scores) {
            if (score > M) {
                M = score;
            }
        }
        for (int score : scores) {
            sumOfScores += getNewScore(M, score);
        }

        return sumOfScores / scores.length;
    }

    static double getNewScore(int M, int score) {
        return (double) score / M * 100;
    }
}