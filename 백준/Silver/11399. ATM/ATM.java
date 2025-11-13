import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> al = new ArrayList<>();
        while (st.hasMoreTokens()) {
            al.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(al);
        List<Integer> sumAl = new ArrayList<>();
        int sum = 0;
        for (int number : al) {
            sum += number;
            sumAl.add(sum);
        }
        int answer = 0;
        for (int number : sumAl) {
            answer += number;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}