class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String result = "";
        for (int i = 0; i < parts.length; i++){
            for (int j = 0; j < parts[i].length - 1; j++){
                result += my_strings[i].substring(parts[i][j], parts[i][j + 1] + 1);
            }
        }
        return result; 
    }
}