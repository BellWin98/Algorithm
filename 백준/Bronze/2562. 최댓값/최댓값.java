import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * 1. 숫자 9개를 for문으로 입력받으면서 변수 max를 갱신한다.
     * 2. 동시에, 순서 인덱스도 함께 갱신한다.
     * 3. max와 index를 개행해서 출력한다.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 1; i <= 9; i++){
            int number = Integer.parseInt(br.readLine());
            if (number > max){
                max = number;
                index = i;
            }
        }
        System.out.println(max + "\n" + index);
    }
}