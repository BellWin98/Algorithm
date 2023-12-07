class Solution {
    public String solution(String my_string, String letter) {
        // 두 번째 시도
        String result = "";
        for (int i = 0; i < my_string.length(); i++){
            char temp = my_string.charAt(i);
            if (temp != letter.charAt(0)) {
                result += temp;
            }
        }
        return result;
        
        // 첫 번째 시도
        // StringBuilder answer = new StringBuilder();
        // String[] strSplit = my_string.split("");
        // for (String str : strSplit){
        //     if (!str.equals(letter)){
        //         answer.append(str);
        //     }
        // }
        // return answer.toString();
    }
}