import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rsp_arr = rsp.split("");
        Map<String, String> rsp_map = new HashMap<>();
        rsp_map.put("2", "0");
        rsp_map.put("0", "5");
        rsp_map.put("5", "2");
        
        for (String str : rsp_arr){
            answer += rsp_map.get(str);
        }
        return answer;
    }
}