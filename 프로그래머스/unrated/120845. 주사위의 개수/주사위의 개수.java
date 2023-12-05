class Solution {
    public int solution(int[] box, int n) {
        int count = 1;
        for (int idx : box){
            count *= idx / n;
        }
        return count;
    }
}