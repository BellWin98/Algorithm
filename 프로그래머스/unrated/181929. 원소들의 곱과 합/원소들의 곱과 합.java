class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiples = 1;
        
        for (int number : num_list){
            sum += number;
            multiples *= number;
        }
        
        return multiples < sum * sum ? 1 : 0; 
    }
}