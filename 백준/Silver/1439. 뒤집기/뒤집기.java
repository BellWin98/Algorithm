import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        br.close();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 2; i++) {
            int count = 0;
            int before = Character.getNumericValue(S.charAt(0));
            if (i != before) {
                count++;
            }
            for (int l = 1; l < S.length(); l++) {
                int target = Character.getNumericValue(S.charAt(l));
                if (i != target && before != target) {
                    count++;
                }
                before = target;
            }
            min = Math.min(min, count);
        }
        bw.write(min + "\n");
        bw.flush();
        bw.close();
    }
}

