import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double M = Integer.MIN_VALUE;
        double[] scores = new double[N];
        double sum = 0;

        for (int i = 0; i < N; i++){
            int score = Integer.parseInt(st.nextToken());
            M = Math.max(M, score);
            scores[i] = score;
        }

        for (int i = 0; i < N; i++){
            scores[i] = (scores[i] / M) * 100.0;
            sum += scores[i];
        }

        System.out.println(sum / N);
    }
}