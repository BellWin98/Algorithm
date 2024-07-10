import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * 1. toCharArray()를 사용해 뭄자열을 char로 나눈다.
     * 2. 각 char를 int로 강제 형병환을 해서 카이사르를 원래 단어로 만든다.
     * 3. A, B, C의 경우 => 23을 더해 X, Y, Z로 만들어 준다.
     * 4. StringBuilder에 char 하나씩 넣어준다.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String word = br.readLine();

        for (char c : word.toCharArray()){
            char toCaesar;
            if (c == 'A' || c == 'B' || c == 'C'){
                toCaesar = (char) ((int) c + 23);
            } else {
                toCaesar = (char) ((int) c - 3);
            }
            sb.append(toCaesar);
        }

        System.out.println(sb);

    }
}