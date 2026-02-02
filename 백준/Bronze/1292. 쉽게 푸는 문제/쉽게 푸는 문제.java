import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int A = Integer.parseInt(st.nextToken()) - 1;
        int B = Integer.parseInt(st.nextToken()) - 1;

        int sum = 0;
        int number = 1;
        List<Integer> al = new ArrayList<>();
        while (al.size() <= B) {
            for (int i = 0; i < number; i++) {
                al.add(number);
            }
            number++;
        }
        for (int i = A; i <= B; i++) {
            sum += al.get(i);
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}
