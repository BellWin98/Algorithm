import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> numberList = new ArrayList<>();
        for (int number : arr){
            if (number % divisor == 0){
                numberList.add(number);
            }
        }
        if (numberList.isEmpty()){
            return new int[]{-1};
        }
        return numberList.stream().sorted().mapToInt(a -> a).toArray();
    }
}