class Solution {
    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for (int number : array){
            sb.append(String.valueOf(number));
        }
        
        if (!sb.toString().contains("7")){
            return answer;
        }
        
        for (int i = 0; i < sb.toString().length(); i++){
            if (sb.toString().charAt(i) == '7'){
                answer++;
            }
        }
        
        return answer;
    }
}