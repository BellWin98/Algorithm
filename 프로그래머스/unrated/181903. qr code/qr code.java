class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = code.split("");
        for (int i = 0; i < strArr.length; i++){
            if (i % q == r){
                sb.append(strArr[i]);
            }
        }
        return sb.toString();
    }
}