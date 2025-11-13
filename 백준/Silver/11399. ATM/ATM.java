import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        List<Integer> al = new ArrayList<>();
        while (st.hasMoreTokens()) {
            al.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(al);
        int sum = 0;
        int prev = 0;
        for (int number : al) {
            prev += number;
            sum += prev;
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}