import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }

        System.out.println(min + " " + max);
    }
}