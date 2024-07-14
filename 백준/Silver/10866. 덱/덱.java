import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> DQ = new ArrayDeque<>();

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int X = 0;
            if (st.hasMoreTokens()){
                X = Integer.parseInt(st.nextToken());
            }
            switch (command){
                case "push_front":
                    DQ.addFirst(X);
                    break;
                case "push_back":
                    DQ.addLast(X);
                    break;
                case "pop_front":
                    if (!DQ.isEmpty()){
                        System.out.println(DQ.pollFirst());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "pop_back":
                    if (!DQ.isEmpty()){
                        System.out.println(DQ.pollLast());
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
                        System.out.println(DQ.peekFirst());
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