class Solution {
    public String solution(String myString) {
        // 다른 사람 풀이
        return myString.toLowerCase().replace('a', 'A');
    }
}
        // 내 풀이
        // myString = myString.replace('a', 'A');
        // for (int i = 0; i < myString.length(); i++){         
        //     if (myString.charAt(i) != 'A'){
        //         myString = myString.replace(myString.charAt(i), Character.toLowerCase(myString.charAt(i)));
        //     }
        // }
        // return myString;