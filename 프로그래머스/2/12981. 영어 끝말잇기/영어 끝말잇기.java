import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        // Map의 key값이 2 이상이면 탈락
        // 이전 문자열 인덱스의 마지막 문자로 시작하는 단어가 아니면 탈락
        // 각 player별 번호 부여
        // 차례 인덱스 선언 (turn)
        // 탈락자가 생기지 않으면(words.length까지의 for문을 전부 순회하면) [0, 0] 리턴
        Map<String, Integer> map = new HashMap<>();
        int turn = 1; // 차례
        int player = 1; // 플레이어 번호
        map.put(words[0], 1);
        String prev = words[0]; // 이전 문자열
        for (int i = 1; i < words.length; i++){
            player++;
            if (words[i].charAt(0) != prev.charAt(prev.length() - 1)){
                return new int[]{player, turn};
            }

            map.put(words[i], map.getOrDefault(words[i], 0) + 1);

            if (map.get(words[i]) > 1){
                return new int[]{player, turn};
            }
            
            // player가 n가 일치하면 모든 플레이어를 순회하였으므로, 초기화
            if (player == n){
                player = 0; 
                turn++;
            }

            // 이전 문자열
            prev = words[i];
        }
        return new int[]{0, 0};
    }
}