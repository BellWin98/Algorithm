class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orderStr = String.valueOf(order);
        String[] orderStrArr = orderStr.split("");
        
        for (String number : orderStrArr){
            if (number.equals("3") || number.equals("6") || number.equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}