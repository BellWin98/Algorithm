import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 1. 입력 문자열을 List에 넣는다.
     * 2. ASCII 코드에서 소문자 a ~ z까지 뽑아서, List에 포함되는 지 확인. 이후 indexOf로 인덱스 추출.
     * 3. list에 알파벳 없을 경우 -1 반환
     * 4. 공백으로 구분해서 출력
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String inputStr = br.readLine();
        List<Character> characterList = new ArrayList<>();
        for (char c : inputStr.toCharArray()){
            characterList.add(c);
        }
        for (int i = 97; i <= 122; i++){
            if (characterList.contains((char) i)) {
                sb.append(characterList.indexOf((char) i)).append(" ");
            } else {
                sb.append(-1).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}