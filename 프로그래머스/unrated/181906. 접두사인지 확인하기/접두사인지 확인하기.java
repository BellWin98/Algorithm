class Solution {
    public int solution(String my_string, String is_prefix) {
        int len = my_string.length();
        if (is_prefix.length() > len) {
            return 0;
        }
        return my_string.substring(0, len - (len - is_prefix.length())).equals(is_prefix) ? 1 : 0;
    }
}