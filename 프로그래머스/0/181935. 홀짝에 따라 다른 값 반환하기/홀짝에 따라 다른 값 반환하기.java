class Solution {
    public int solution(int n) {
        return n % 2 == 0 ? sumEvenNumbers(n) : sumOddNumbers(n);
    }
    
    private static int sumOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        
        return sum;
    }
    
    private static int sumEvenNumbers(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i * i;
        }
        
        return sum;
    }
}