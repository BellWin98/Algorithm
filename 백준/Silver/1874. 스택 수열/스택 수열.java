import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int number = 1;
        stack.push(number++);
        sb.append("+\n");
        for (int i = 0; i < N; i++) {
            int target = Integer.parseInt(br.readLine());
            while (number <= target) {
                stack.push(number++);
                sb.append("+\n");
            }
            if (target != stack.peek()) {
                sb.append("NO\n");
            } else {
                sb.append("-\n");
                stack.pop();
            }
        }
        String answer = sb.toString();
        if (answer.contains("NO")) {
            answer = "NO\n";
        }
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}