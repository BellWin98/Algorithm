import java.util.*;

class Solution {
    public int[] solution(int n) {
        // 소인수 중복 제거를 위한 Set 자료구조 사용
        Set<Integer> primeSet = new HashSet<>();
        
        // 2부터 n까지의 n의 약수 중 소수 구하는 로직
        for (int i = 2; i <= n; i++){
            // 약수 갯수가 2개를 초과하는 지 확인하는 카운트 변수
            int count = 1;
            
            // n의 약수인 i의 약수 (즉, 소수) 개수 카운트
            for (int j = 2; j <= i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            // 카운트가 2개를 초과하면 Set에 넣지 않고 continue
            if (count > 2){
                continue;
            }
            
            // i가 소수이면 Set에 추가 
            if (n % i == 0){
                primeSet.add(i);
            }
        }
        
        // Set의 사이즈만큼의 int 배열 생성
        int[] answer = new int[primeSet.size()];
        
        // Set은 인덱스 접근이 불가하므로, iterator로 각 요소 추출 
        Iterator<Integer> primeIter = primeSet.iterator();
        int index = 0;
        while (primeIter.hasNext()){
            answer[index++] = primeIter.next();
        }
        
        // Set은 데이터의 순서가 없으므로, 배열에서 오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
}