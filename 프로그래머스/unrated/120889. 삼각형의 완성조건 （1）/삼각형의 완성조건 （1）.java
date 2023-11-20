class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        for (int side : sides){
            if (side > max){
                max = side;
            }
            sum += side;
        }
        sum = sum - max; 
        return max < sum ? 1 : 2;
    }
}