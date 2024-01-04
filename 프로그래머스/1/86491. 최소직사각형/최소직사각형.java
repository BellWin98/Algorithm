class Solution {
    public int solution(int[][] sizes) {
        int maxOfmax = 0;
        int maxOfmin = 0;
        for (int[] size : sizes){
            int maxNum = Math.max(size[0], size[1]);
            int minNum = Math.min(size[0], size[1]);
            if (maxNum > maxOfmax){
                maxOfmax = maxNum;
            }
            if (minNum > maxOfmin){
                maxOfmin = minNum;
            }
        }
        return maxOfmax * maxOfmin;
    }
}