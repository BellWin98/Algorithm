class Solution {
    public int solution(int n) {
        String binaryStrN = Integer.toBinaryString(n);
        int oneCount = 0;
        for (char c : binaryStrN.toCharArray()){
            if (c == '1'){
                oneCount++;
            }
        }
        while (true){
            int count = 0;
            String binary = Integer.toBinaryString(++n);
            for (char c : binary.toCharArray()){
                if (c == '1'){
                    count++;
                }
            }
            if (count == oneCount){
                return n;
            }
        }
    }
}