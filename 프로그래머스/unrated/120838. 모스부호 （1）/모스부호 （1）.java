import java.util.*;

class Solution {
    public String solution(String letter) {
        // 모스부호 String 배열에 저장
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        // 공백으로 분리된 모스부호 String 배열에 저장
        String[] letterSplit = letter.split(" ");
        
        // 모스부호-알파벳(소문자) 매핑하기 위한 Map 자료구조 사용 
        Map<String, String> letterMap = new HashMap<>();
        
        // 'a'와 대응하는 ascii 숫자 변수화
        int ascii = 97;
        
        // 모스부호에 대응하는 문자를 이어 붙이기 위한 StringBuilder 선언
        StringBuilder sb = new StringBuilder();
        
        // 모스부호와 그에 상응하는 알파벳 소문자("a" ~ "z") Map 자료구조에 저장
        for (int i = 0; i < morse.length; i++){
            char ch = (char) ascii; // int -> char
            letterMap.put(morse[i], String.valueOf(ch));
            ascii++;
        }
        
        for (String alphabet : letterSplit){
            sb.append(letterMap.get(alphabet));
        }
        return sb.toString(); 
    }
}