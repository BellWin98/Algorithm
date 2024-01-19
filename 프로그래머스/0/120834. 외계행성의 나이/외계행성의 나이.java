class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(age);
        for (char c : str.toCharArray()){
            sb.append((char) ((int) c + 49));
        }
        return sb.toString();
    }
}
// String answer = "";
// String strAge = Integer.toString(age);
// for (int i = 0; i < strAge.length(); i++){
//     int cutInt = Character.getNumericValue(strAge.charAt(i));
//     char ch = (char) (cutInt + 97);
//     answer += ch;
// }
// return answer;