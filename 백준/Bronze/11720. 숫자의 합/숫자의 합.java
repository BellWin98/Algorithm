import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(solution(N, s));
    }

    static int solution(int n, String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        return sum;
    }
}