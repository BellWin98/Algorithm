import java.util.*;

class Solution {
    static List<Integer> numberList;
    static boolean[] visited;
    static Set<List<Integer>> permutations; // 중복 순열 제거
    static List<Integer> temp;
    
    public int solution(String numbers) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        numberList = new ArrayList<>();
        permutations = new HashSet<>();
        temp = new ArrayList<>();
        String[] numberSplit = numbers.split("");
        for (String str : numberSplit){
            numberList.add(Integer.parseInt(str));
        }
        visited = new boolean[numberList.size()];
        permutation();
        
        for (List<Integer> permutation : permutations){
            sb.setLength(0);
            for (int number : permutation){
                sb.append(number);
            }
            int number = Integer.parseInt(sb.toString());
            if (number == 1){
                continue;
            }
            // 소수 체크
            if (isPrimeNumber(number)){
                answer++;
            }
        }
        return answer;
    }

    void permutation(){
        for (int i = 0; i < numberList.size(); i++){
            if (!visited[i]){
                visited[i] = true;
                temp.add(numberList.get(i));
                permutation();
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
        // temp가 공백이거나, 요소가 0으로 시작할 때 리스트 삽입 x
        if (temp.size() == 0 || temp.get(0) == 0){
            return;
        }
        permutations.add(new ArrayList<>(temp));
    }
    
    boolean isPrimeNumber(int number){
        for (int i = 2; i * i <= number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}