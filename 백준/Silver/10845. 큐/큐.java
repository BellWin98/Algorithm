import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> DQ = new ArrayDeque<>();

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command;
            int X = 0;
            if (st.countTokens() > 1) {
                command = st.nextToken();
                X = Integer.parseInt(st.nextToken());
            } else {
                command = st.nextToken();
            }

            switch (command){
                case "push":
                    DQ.add(X);
                    break;
                case "pop":
                    if (!DQ.isEmpty()){
                        System.out.println(DQ.pollFirst());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(DQ.size());
                    break;
                case "empty":
                    if (!DQ.isEmpty()){
                        System.out.println(0);
                    } else {
                        System.out.println(1);
                    }
                    break;
                case "front":
                    if (!DQ.isEmpty()){
                        System.out.println(DQ.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "back":
                    if (!DQ.isEmpty()){
                        System.out.println(DQ.peekLast());
                    } else {
                        System.out.println(-1);
                    }
            }
        }
    }
}