import java.util.*;

class Solution {

    static class Node {
        int start;
        int end;
        int count;
        
        Node(int start, int end, int count){
            this.start = start;
            this.end = end;
            this.count = count;
        }
    }
    public int[] solution(int[] sequence, int k) {
        List<Node> combinations = new ArrayList<>();
        int sum = 0;
        int end = 0;

        for (int start = 0; start < sequence.length; start++){
            while (sum < k && end < sequence.length){
                sum += sequence[end];
                end++;
            }
            
            if (sum == k){
                combinations.add(new Node(start, end - 1, end - 1 - start));
            }
            
            sum -= sequence[start]; 
        }
        
        combinations.sort((o1, o2) -> o1.count - o2.count);
        return new int[]{combinations.get(0).start, combinations.get(0).end};
    }
}