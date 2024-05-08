import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String type = "long ";
        int loopCount = N % 4 == 0 ? N / 4 : N / 4 + 1;
        
        for (int i = 0; i < loopCount; i++){
            sb.append(type);
        }
        
        System.out.println(sb.append("int"));
    }
}