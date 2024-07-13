import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command;
            int X = 0;
            if (st.countTokens() > 1){
                command = st.nextToken();
                X = Integer.parseInt(st.nextToken());
            } else {
                command = st.nextToken();
            }

            switch (command){
                case "push":
                    stack.push(X);
                    break;
                case "pop":
                    if (!stack.empty()){
                        System.out.println(stack.pop());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.empty()){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if (!stack.empty()){
                        System.out.println(stack.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}