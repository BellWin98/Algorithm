class Solution {
    public int solution(int[] nums) {
        
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)){
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
    
    public static boolean isPrime(int number){

        for (int i = 2; i * i <= number; i++){
            if (number % i == 0){
                return false;
            }
        }
        
        return true;
    }
}