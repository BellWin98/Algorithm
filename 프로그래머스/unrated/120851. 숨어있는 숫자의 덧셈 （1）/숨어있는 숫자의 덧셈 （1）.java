class Solution {
    public int solution(String my_string) {
        
        String[] str_split = my_string.split("");
        int sum = 0;
        
        for (int i = 0; i < my_string.length(); i++){
            if (Character.isDigit(my_string.charAt(i))){
                sum += Integer.parseInt(str_split[i]);
            }
        }
        
        return sum;
    }
}