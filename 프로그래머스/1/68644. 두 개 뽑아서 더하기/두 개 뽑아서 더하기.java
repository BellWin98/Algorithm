import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> numSet = new TreeSet<>();
        for (int i = 0; i< numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                numSet.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[numSet.size()];
        int count = 0;
        for (int a : numSet){
            answer[count] = a;
            count++;
        }
        // Iterator<Integer> numIter = numSet.iterator();
        // int i = 0;
        // while (numIter.hasNext()){
        //     answer[i] = numIter.next();
        //     i++;
        // }
        return answer;
    }
}

// List 활용 풀이
//         List<Integer> numberList = new ArrayList<>();
//         for (int i = 0; i < numbers.length - 1; i++){
//             for (int j = i + 1; j < numbers.length; j++){
//                 if (!numberList.contains(numbers[i] + numbers[j])){
//                     numberList.add(numbers[i] + numbers[j]);
//                 }
//             }
//         }
//         Collections.sort(numberList);
//         int[] answer = new int[numberList.size()];
//         for (int i = 0; i < answer.length; i++){
//             answer[i] = numberList.get(i);
//         }
//         return answer;

// 배열 활용 풀이
//         int[] temp = new int[numbers.length * (numbers.length - 1) / 2];
//         int[] answer = new int[numbers.length * (numbers.length - 1) / 2];
//         int index = 0;
//         int count = 0;
//         for (int i = 0; i < numbers.length - 1; i++){
//             for (int j = i + 1; j < numbers.length; j++){
//                 temp[index] = numbers[i] + numbers[j];
//                 index++;
//             }
//         }
//         Arrays.sort(temp);
//         System.out.println(Arrays.toString(temp));
        
//         for (int i = 0; i < answer.length - 1; i++){
//             if (temp[i] != temp[i + 1]){
//                 answer[count] = temp[i];
//                 count++;
//             }
//         }
//         answer[count] = temp[temp.length - 1];
//         answer = Arrays.copyOfRange(answer, 0, count + 1);
//         return answer;