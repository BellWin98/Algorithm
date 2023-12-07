class Solution {
    public int solution(int[] num_list) {
        
        int len = num_list.length;
        int multiples = 1;
        int sum = 0;
        if (len >= 11){
            for (int idx : num_list){
                sum += idx;
            }
            return sum;
        }
        for (int idx : num_list){
            multiples *= idx;
        }
        return multiples;
    }
}