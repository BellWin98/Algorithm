import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sbA = new StringBuilder();
        StringBuilder sbB = new StringBuilder();

        String A = st.nextToken();
        String B = st.nextToken();

        for (int i = 2; i >= 0; i--){
            sbA.append(A.charAt(i));
            sbB.append(B.charAt(i));
        }

        System.out.println(Math.max(Integer.parseInt(sbA.toString()), Integer.parseInt(sbB.toString())));
    }
}