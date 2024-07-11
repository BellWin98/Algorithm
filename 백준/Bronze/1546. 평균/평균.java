import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> numberList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        double sum = 0;
        while (st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            if (number > max){
                max = number;
            }
            numberList.add(number);
        }

        for (int number : numberList){
            sum += (double) number / max * 100;
        }

        System.out.println(sum / N);
    }
}