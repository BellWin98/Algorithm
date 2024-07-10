import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * 1. 변수는 sum과 min을 선언 / sum 초기값은 0
     * 2. for문 내에 홀수 골라내는 조건식 넣어주고, 홀수인 경우 sum에 더해주고, min과 값 비교 수행
     * 3. for문 종료 후애 sum이 0이면, 홀수가 등장하지 않은 것이므로 -1 출력
     * 4. sum, min 개행하여 출력
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++){
            int inputNumber = Integer.parseInt(br.readLine());
            if (inputNumber % 2 != 0){
                sum += inputNumber;
                if (inputNumber < min) {
                    min = inputNumber;
                }
            }
        }
        if (sum == 0){
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
    }
}