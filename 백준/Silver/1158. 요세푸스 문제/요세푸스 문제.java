import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        Queue<Integer> Q = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int index = 1;

        for (int i = 1; i <= N; i++){
            Q.add(i);
        }

        while (!Q.isEmpty()){
            if (index == K){
                if (Q.size() == 1){
                    sb.append(Q.poll()).append(">");
                    break;
                }
                sb.append(Q.poll()).append(", ");
                index = 1;
                continue;
            }
            Q.offer(Q.poll());
            index++;
        }
        
        System.out.println(sb.toString().trim());
    }
}