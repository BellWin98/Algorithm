import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber = br.readLine();
        int half = inputNumber.length() / 2;
        int left = 0;
        int right = 0;

        for (int i = 0; i < half; i++){
            left += Character.getNumericValue(inputNumber.charAt(i));
        }

        for (int i = half; i < inputNumber.length(); i++){
            right += Character.getNumericValue(inputNumber.charAt(i));
        }

        if (left == right){
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
