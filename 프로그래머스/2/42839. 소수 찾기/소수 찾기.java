import java.util.*;

class Solution {
    public int solution(String numbers) {
        Set<Integer> numberSet = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        dfs(numbers, "", visited, numberSet);
        
        int answer = 0;
        for (int number : numberSet) {
            if (isPrime(number)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static void dfs(String numbers, String current, boolean[] visited, Set<Integer> numberSet) {
        if (!current.isEmpty()) {
            numberSet.add(Integer.parseInt(current));
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, current + numbers.charAt(i), visited, numberSet);
                visited[i] = false;
            }
        }
    }
    
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}