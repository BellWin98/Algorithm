import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> phoneSet = new HashSet<>(Arrays.asList(phone_book));
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                String prefix = phone.substring(0, i);
                if (phoneSet.contains(prefix)) {
                    return false;
                }
            }
        }
        return true;
    }
}