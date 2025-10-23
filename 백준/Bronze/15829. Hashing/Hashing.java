import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int charNum = (int) str.charAt(i) - 96;
            sum += charNum * (int) Math.pow(31, i);
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}