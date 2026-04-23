import java.util.*;

class Solution {
    
    static class Node {
        String word;
        int count;

        Node(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        Queue<Node> Q = new LinkedList<>();
        List<String> visitedList = new ArrayList<>();
        Q.add(new Node(begin, 0));

        while (!Q.isEmpty()) {
            Node cur = Q.poll();
            String curWord = cur.word;
            if (curWord.equals(target)) {
                return cur.count;
            }
            for (String word : words) {
                if (visitedList.contains(word)) {
                    continue;
                }
                int missCount = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (curWord.charAt(i) != word.charAt(i)) {
                        missCount++;
                        if (missCount > 1) {
                            break;
                        }
                    }
                }
                if (missCount == 1) {
                    Q.add(new Node(word, cur.count + 1));
                    visitedList.add(word);
                }
            }
        }

        return 0;
    }
}