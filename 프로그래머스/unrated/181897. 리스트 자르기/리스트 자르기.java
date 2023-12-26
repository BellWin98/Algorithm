import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> numberList = new ArrayList<>();
        switch (n){
            case 1:
                for (int i = 0; i <= slicer[1]; i++){
                    numberList.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = slicer[0]; i < num_list.length; i++){
                    numberList.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = slicer[0]; i <= slicer[1]; i++){
                    numberList.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = slicer[0]; i <= slicer[1]; i = i + slicer[2]){
                    numberList.add(num_list[i]);
                }
                break;
        }
        return numberList.stream().mapToInt(a -> a).toArray();
    }
}