import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> primeSet = new HashSet<>();
        for (int i = 2; i <= n; i++){
            int count = 1;
            for (int j = 2; j <= i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count > 2){
                continue;
            }
            if (n % i == 0){
                primeSet.add(i);
            }
        }
        int[] answer = new int[primeSet.size()];
        Iterator<Integer> primeIter = primeSet.iterator();
        int index = 0;
        while (primeIter.hasNext()){
            answer[index++] = primeIter.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}