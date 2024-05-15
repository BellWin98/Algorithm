import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Character, Integer> data = new HashMap<>();
        data.put('A', 2);
        data.put('B', 2);
        data.put('C', 2);
        data.put('D', 3);
        data.put('E', 3);
        data.put('F', 3);
        data.put('G', 4);
        data.put('H', 4);
        data.put('I', 4);
        data.put('J', 5);
        data.put('K', 5);
        data.put('L', 5);
        data.put('M', 6);
        data.put('N', 6);
        data.put('O', 6);
        data.put('P', 7);
        data.put('Q', 7);
        data.put('R', 7);
        data.put('S', 7);
        data.put('T', 8);
        data.put('U', 8);
        data.put('V', 8);
        data.put('W', 9);
        data.put('X', 9);
        data.put('Y', 9);
        data.put('Z', 9);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int answer = 0;

        for (char c : word.toCharArray()){
            answer += data.get(c) + 1;
        }

        System.out.println(answer);
    }
}