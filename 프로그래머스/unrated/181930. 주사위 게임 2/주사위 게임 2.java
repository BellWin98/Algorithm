class Solution {
    public int solution(int a, int b, int c) {
        int n = 0;
        if (a == b && b == c && a == c){
            n = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if (a != b && b != c && a != c){
            n = a + b + c;
        } else {
            n = (a + b + c) * (a * a + b * b + c * c);
        }
        return n;
    }
}