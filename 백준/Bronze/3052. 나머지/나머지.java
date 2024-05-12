import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        int answer = 0;
        numbers.add(-1); // 나머지 값 비교를 위한 초기화(음수) 값 삽입

        for (int i = 0; i < 10; i++){
            int number = Integer.parseInt(br.readLine());
            number %= 42;

            // 계산된 나머지가 리스트에 존재하지 않으면, 리스트에 나머지 삽입 후 answer 1 증가
            if (!numbers.contains(number)) {
                numbers.add(number);
                answer++;
            }
        }

        System.out.println(answer);
    }
}