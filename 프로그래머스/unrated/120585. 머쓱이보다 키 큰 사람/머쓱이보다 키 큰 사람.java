class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        for (int number : array){
            if (number > height){
                count++;
            }
        }
        return count;
    }
}