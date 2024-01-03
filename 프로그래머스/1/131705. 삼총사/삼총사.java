import java.util.*;

class Solution {
    static List<List<Integer>> combinations;
    static List<Integer> temp;
    
    public int solution(int[] number) {
        int answer = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        combinations = new ArrayList<>();
        temp = new ArrayList<>();
        combination(number, 0);
        for (List<Integer> numbers : combinations){
            if (numbers.size() == 3){
                answer++;
            }
        }
        return answer;
    }
    
    void combination(int[] number, int start){
        if (temp.size() == 3){
            int sum = 0;
            for (int value : temp){
                sum += value;
            }
            if (sum == 0){
                combinations.add(new ArrayList<>(temp));
                return;
            }
        }
        for (int i = start; i < number.length; i++){
            temp.add(number[i]);
            combination(number, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}