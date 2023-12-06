class Solution {
    public String solution(int age) {
        String answer = "";
        String strAge = Integer.toString(age);
        for (int i = 0; i < strAge.length(); i++){
            int cutInt = Character.getNumericValue(strAge.charAt(i));
            char ch = (char) (cutInt + 97);
            answer += ch;
        }
        return answer;
    }
}