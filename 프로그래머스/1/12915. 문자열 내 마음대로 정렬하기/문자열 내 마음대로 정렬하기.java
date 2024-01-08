import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length - 1; i++){
            for (int j = i + 1; j < strings.length; j++){
                if (strings[i].charAt(n) > strings[j].charAt(n)){
                    swap(strings, i, j);
                } else if (strings[i].charAt(n) == strings[j].charAt(n)) {
                    if (strings[i].compareTo(strings[j]) > 0){
                        swap(strings, i, j);
                    }
                }
            }
        }
        return strings;
    }
    
    void swap(String[] strings, int a, int b){
        String temp = strings[a];
        strings[a] = strings[b];
        strings[b] = temp;
    }
}