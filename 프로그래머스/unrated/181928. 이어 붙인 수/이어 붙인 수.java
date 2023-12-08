class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddNumbers = new StringBuilder();
        StringBuilder evenNumbers = new StringBuilder();
        for (int number : num_list){
            if (number % 2 == 0){
                evenNumbers.append(String.valueOf(number));
                continue;
            }
            oddNumbers.append(String.valueOf(number));
        }
        return Integer.parseInt(oddNumbers.toString()) + Integer.parseInt(evenNumbers.toString());
    }
}