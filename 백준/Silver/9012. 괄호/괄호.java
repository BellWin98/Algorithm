import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            boolean isBreak = false;
            for (char c : br.readLine().toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else { // 닫는 괄호가 들어왔을 때
                    if (stack.isEmpty()) {
                        isBreak = true;
                        break;
                    } else {
                        if (stack.peek() == '(') {
                            stack.pop();
                        }
                    }
                }
            }
            if (stack.isEmpty() && !isBreak) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}