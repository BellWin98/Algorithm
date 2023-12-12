class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sumArr1 = 0;
        int sumArr2 = 0;
        
        if (arr2.length > arr1.length) {
            return -1;
        } else if (arr1.length > arr2.length){
            return 1;
        } else {
            for (int valueArr1 : arr1){
                sumArr1 += valueArr1;
            }
            for (int valueArr2 : arr2){
                sumArr2 += valueArr2;
            }
            if (sumArr1 > sumArr2){
                return 1;
            } else if (sumArr2 > sumArr1){
                return -1;
            } else {
                return 0; 
            }
        }
    }
}