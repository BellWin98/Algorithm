class Solution {
    public int solution(String message) {
        String[] messageSplit = message.split("");
        return messageSplit.length * 2;
    }
}