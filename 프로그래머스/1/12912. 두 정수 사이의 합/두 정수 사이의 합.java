class Solution {
    public long solution(int a, int b) {
        int first = 0;
        int second = 0;
        long sum = 0;
        if (a == b){
            return a;
        }
        if (a < b){
            first = a;
            second = b;
        } else {
            first = b;
            second = a;
        }
        for (int i = first; i <= second; i++){
            sum += i;
        }
        return sum;
    }
}