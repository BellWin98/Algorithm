class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean first = false;
        boolean second = false;
        if (x1 != x2){
            first = true;
        } else if (x1 == false && x2 == false){
            first = false;
        } else {
            first = true;
        }
        
        if (x3 != x4){
            second = true;
        } else if (x3 == false && x4 == false){
            second = false;
        } else {
            second = true;
        }
        
        if (first != second){
            return false;
        } else if (first == false && second == false){
            return false;
        } else {
            return true;
        }
    }
}