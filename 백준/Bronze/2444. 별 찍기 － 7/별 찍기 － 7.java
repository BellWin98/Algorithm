import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++){
            sb.append(" ".repeat(N - i)).append("*".repeat(2 * i - 1));
            System.out.println(sb);
            sb.setLength(0);
        }
        for (int i = N - 1; i >= 1; i--){
            sb.append(" ".repeat(N - i)).append("*".repeat(2 * i - 1));
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}