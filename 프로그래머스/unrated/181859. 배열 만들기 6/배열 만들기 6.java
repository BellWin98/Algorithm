import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numberList = new ArrayList<>();
        int i = 0;
        while (i < arr.length){
            if (numberList.isEmpty()){
                numberList.add(arr[i]);
                i++;
                continue;
            }
            if (numberList.get(numberList.size() - 1) == arr[i]){
                numberList.remove(numberList.size() - 1);
                i++;
                continue;
            }
            if (numberList.get(numberList.size() - 1) != arr[i]){
                numberList.add(arr[i]);
                i++;
            }
        }
        if (numberList.isEmpty()){
            return new int[]{-1};
        }
        return numberList.stream().mapToInt(a -> a).toArray();
    }
}