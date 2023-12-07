import java.lang.Math;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int[] result = new int[2];
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        result[0] = numer;
        result[1] = denom;
        
        int minNumber = Math.min(numer, denom);
        int max = 0;
        
        for (int i = 2; i <= minNumber; i++){
            if (numer % i == 0 && denom % i == 0){
                max = i;
            }
        }
        
        if (max != 0){
            result[0] = numer / max;
            result[1] = denom / max;
        }
        
        return result;
    }
}