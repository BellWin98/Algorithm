import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String> logs = new ArrayList<>();
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
        for (String str : record){
            String[] strSplit = str.split(" ");
            if (strSplit[0].equals("Enter")){
                logs.add(enterMessage(map.get(strSplit[1])));
                continue;
            }
            
            if (strSplit[0].equals("Leave")){
                logs.add(exitMessage(map.get(strSplit[1])));
                continue;
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