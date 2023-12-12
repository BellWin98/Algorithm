class Solution {
    public int solution(int[] num_list) {
        int sumOdd = 0;
        int sumEven = 0;
        
        for (int i = 0; i < num_list.length; i++){
            if (i % 2 == 0){ // 홀수번째 원소
                sumOdd += num_list[i];
            } else {
                sumEven += num_list[i];
            }
        }
        
        if (sumOdd != sumEven){
            return sumOdd > sumEven ? sumOdd : sumEven; 
        }
        
        return sumOdd;
    }
}