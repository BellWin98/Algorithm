import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> strList = new ArrayList<>();
        String[] sp = myString.split("x");
        Arrays.sort(sp);
        for (String str : sp){
            if (!str.equals("")){
                strList.add(str);
            }
        }
        String[] answer = new String[strList.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = strList.get(i);
        }
        System.out.println(strList);
        return answer;
        // return sp;
    }
}

// List<String> answerList = new ArrayList<>();
//         String[] temp = myString.split("x");
//         for (int i = 0; i < temp.length; i++) {
//             if (!temp[i].equals("")){
//                 answerList.add(temp[i]);    
//             }
//         }
//         Collections.sort(answerList);
        
//         return answerList.toArray(new String[answerList.size()]);