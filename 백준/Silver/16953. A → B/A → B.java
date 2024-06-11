import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int count = 1;

        // B가 짝수면 2로 나누고, 홀수면 1로 끝나는 경우밖에 없으므로 1을 제거 후 진행
        while (A != B) {
            if (B < A){
                System.out.println(-1);
                return;
            }

            if (B % 2 == 0){
                B = B / 2;
            } else {
                // 작업이 이루어지는 숫자의 1의 자리가 1이 아니면 -1 출력 후 종료
                if (B % 10 != 1){
                    System.out.println(-1);
                    return;
                }
                B = B / 10;
            }
            count++;
        }

        System.out.println(count);
    }
}