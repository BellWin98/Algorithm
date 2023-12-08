class Solution {
    public int solution(String A, String B) {
        // 내 풀이
        if (A.equals(B)){
            return 0;
        }
        
        StringBuilder sb = new StringBuilder(A);
        int count = 0;
        for (int i = 0; i < A.length(); i++){
            char temp = sb.charAt(sb.length() - 1);
            sb.delete(sb.length() - 1, sb.length());
            sb.insert(0, temp);
            count++;
            if (sb.toString().equals(B)){
                return count;
            }
        }
        
        return -1;
    }
}