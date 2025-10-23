import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = br.readLine();
            int num = Integer.parseInt(str);
            if (num == 0) {
                break;
            }
            int len = str.length();
            boolean isPelin = true;
            for (int i = 0; i < len / 2; i++) {
                if (str.charAt(i) != str.charAt(len - 1 - i)) {
                    bw.write("no" + "\n");
                    isPelin = false;
                    break;
                }
            }
            if (isPelin) {
                bw.write("yes" + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}