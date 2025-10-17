import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        int sum = 0;
        for (char number : numbers.toCharArray()) {
            sum += Character.getNumericValue(number);
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}