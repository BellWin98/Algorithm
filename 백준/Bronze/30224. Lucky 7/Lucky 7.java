import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String sNumber = br.readLine();
        boolean bSevenExists = sNumber.contains("7");
        int number = Integer.parseInt(sNumber);
        int answer;
        if (bSevenExists) {
            if (number % 7 == 0){
                answer = 3;
            } else {
                answer = 2;
            }
        } else {
            if (number % 7 == 0) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}