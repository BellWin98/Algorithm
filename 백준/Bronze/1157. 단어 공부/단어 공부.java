import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> data = new HashMap<>();
        String word = br.readLine();
        word = word.toUpperCase();

        // 한 글자일 경우 그냥 출력 후 종료
        if (word.length() == 1){
            System.out.println(word);
            return;
        }

        // map에 알파벳(key)과 등장 횟수(value) 삽입
        for (char c : word.toCharArray()){
            data.put(c, data.getOrDefault(c, 0) + 1);
        }

        // map의 key값(Character)을 리스트에 삽입
        List<Character> alphabetsSortedByCountDesc = new ArrayList<>(data.keySet());

        // 리스트에 담긴 알파벳이 1개라면(동일한 알파벳이 여러 개 입력된 경우) 출력 후 종료
        if (alphabetsSortedByCountDesc.size() == 1){
            System.out.println(alphabetsSortedByCountDesc.get(0));
            return;
        }

        // map의 알파벳 등장 횟수 기준으로 리스트 내림차순 정렬
        alphabetsSortedByCountDesc.sort((o1, o2) -> data.get(o2) - data.get(o1));

        // 리스트의 알파벳 최빈값이 2개 이상이면 ? 출력
        if (data.get(alphabetsSortedByCountDesc.get(0))
                .equals(data.get(alphabetsSortedByCountDesc.get(1)))){
            System.out.println("?");
        } else {
            System.out.println(alphabetsSortedByCountDesc.get(0));
        }
    }
}