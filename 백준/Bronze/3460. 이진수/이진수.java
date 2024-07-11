import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /**
     * 1. n을 2로 나눈 몫이 0이 될 때까지 나눈다.
     * 2. 나머지가 1일 때 인덱스를 공백으로 구분하여 출력한다.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int index = 0;
            while (n != 0){
                if (n % 2 == 1){
                    sb.append(index).append(" ");
                }
                n /= 2;
                index++;
            }
        }
        System.out.println(sb.toString().trim());
    }
}