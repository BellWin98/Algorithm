class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        int totalAmount = n * 12000 + k * 2000;
        
        totalAmount -= service * 2000;
        return totalAmount;
    }
}