import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> submitted = new ArrayList<>();

        // 과제를 제출한 학생들 28명 담기
        for (int i = 0; i < 28; i++){
            submitted.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(submitted);

        // 1 ~ 30번의 학생 중 submitted에 없는 학생 출력
        for (int i = 1; i <= 30; i++){
            if (!submitted.contains(i)) {
                System.out.println(i);
            }
        }
    }
}