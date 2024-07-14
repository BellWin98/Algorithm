import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                String splitWord = st.nextToken();
                for (char c : splitWord.toCharArray()){
                    stack.push(c);
                }
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
            sb.setLength(0);
        }
    }
}