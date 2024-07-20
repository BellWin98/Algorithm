import java.util.*;

class Solution {
    static class Node {
        int waitingQueueLocation;
        int priority;

        Node(int waitingQueueLocation, int priority) {
            this.waitingQueueLocation = waitingQueueLocation;
            this.priority = priority;
        }
    }
    
    public int solution(int[] priorities, int location) {
        // 실행 대기 큐에 담긴 우선순위 노드의 위치
        int waitingQueueLocation = 0;
        
        // 우선순위 높은 노드 추출되면 다음 우선순위 가리키는 포인터
        int priorityPointer = 0; 
        
        // 우선순위 높은 순으로 정렬한 리스트
        List<Integer> priorityList = new ArrayList<>(); 
        Queue<Node> Q = new LinkedList<>();
        
        // 실행된 우선순위 노드를 담는 리스트
        List<Node> executedNodes = new ArrayList<>(); 

        for (int priority : priorities){
            priorityList.add(priority);
            Node node = new Node(waitingQueueLocation, priority);
            Q.add(node);
            waitingQueueLocation++;
        }

        priorityList.sort(Comparator.reverseOrder());

        while (!Q.isEmpty()){
            if (Q.peek().priority < priorityList.get(priorityPointer)){
                Q.add(Q.poll());
            } else {
                executedNodes.add(Q.poll());
                priorityPointer++;
            }
        }

        int result = 1; // 몇번째로 실행됐는 지 반환하는 결과값
        for (Node executedNode : executedNodes){
            if (location == executedNode.waitingQueueLocation){
                return result;
            }
            result++;
        }

        return -1;
    }
}