class Solution {
    public String solution(int n) {
        String[] strArr = {"수", "박"};
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (n > 0){
            if (idx == strArr.length){
                idx = 0;
            }
            sb.append(strArr[idx++]);
            n--;
        }
        return sb.toString();
    }
}