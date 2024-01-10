import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        
        // message 담는 리스트 선언
        List<String> logs = new ArrayList<>();
        
        // 첫번째 for문은 Enter, Change만 Map에 데이터 삽입하는 기능  
        // 첫번째 for문이 완료되면 Map에는 닉네임 변경된 데이터들로 갱신되어있다.
        for (String str : record){
            String[] strSplit = str.split(" ");
            if (strSplit[0].equals("Enter")){
                map.put(strSplit[1], strSplit[2]);
                continue;
            }
            
            if (strSplit[0].equals("Change")){
                map.put(strSplit[1], strSplit[2]);
            }
        }
        
        // 두번째 for문은 최신화된 Map 데이터를 이용하여 Enter와 Leave를 처리
        for (String str : record){
            String[] strSplit = str.split(" ");
            if (strSplit[0].equals("Enter")){
                logs.add(enterMessage(map.get(strSplit[1])));
                continue;
            }
            
            if (strSplit[0].equals("Leave")){
                logs.add(exitMessage(map.get(strSplit[1])));
            }
        }
        return logs.toArray(new String[logs.size()]);
    }
    
    String enterMessage(String nickname){
        return nickname + "님이 들어왔습니다.";
    }
    
    String exitMessage(String nickname){
        return nickname + "님이 나갔습니다.";
    }
    
    
}