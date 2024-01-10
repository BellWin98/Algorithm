import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        
        Queue<Integer> minPq = new PriorityQueue<>();
        Queue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
        for (String op : operations){
            String[] sp = op.split(" ");
            if (sp[0].equals("I")){
                minPq.add(Integer.parseInt(sp[1]));
                maxPq.add(Integer.parseInt(sp[1]));
            } else {
                if (!minPq.isEmpty() && sp[1].equals("-1")){
                    int value = minPq.poll();
                    maxPq.remove(value);
                } else if (!maxPq.isEmpty()){
                    int value = maxPq.poll();
                    minPq.remove(value);
                }
            }
        }
        if (minPq.isEmpty() && maxPq.isEmpty()){
            return new int[]{0, 0};
        } 
        return new int[]{maxPq.poll(), minPq.poll()};
    }
}