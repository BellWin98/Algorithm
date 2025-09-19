class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    public static int dfs(int[] numbers, int target, int idx, int sum) {
        if (idx == numbers.length) {
            return target == sum ? 1 : 0;
        }
        
        int add = dfs(numbers, target, idx + 1, sum + numbers[idx]);
        int sub = dfs(numbers, target, idx + 1, sum - numbers[idx]);
        
        return add + sub;
    }
}