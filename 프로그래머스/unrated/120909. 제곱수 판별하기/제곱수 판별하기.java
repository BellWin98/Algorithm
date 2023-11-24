class Solution {
    public int solution(int n) {
        int squareRoot = (int) Math.sqrt(n);
        return squareRoot * squareRoot == n ? 1 : 2;
    }
}