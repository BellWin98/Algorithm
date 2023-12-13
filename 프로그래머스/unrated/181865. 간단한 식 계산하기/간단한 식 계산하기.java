import java.util.*;

class Solution {
    public int solution(String binomial) {
        String op = "";
        if (binomial.contains("+")){
            op = "\\+";
        } else if (binomial.contains("-")){
            op = "\\-";
        } else if (binomial.contains("*")){
            op = "\\*";
        }
        String[] binomialSplit = binomial.split(op);
        binomialSplit[0] = binomialSplit[0].strip();
        binomialSplit[1] = binomialSplit[1].strip();
        int num1 = Integer.parseInt(binomialSplit[0]);
        int num2 = Integer.parseInt(binomialSplit[1]);
        
        switch(op){
            case "\\+":
                return num1 + num2;
            case "\\-":
                return num1 - num2;
            case "\\*":
                return num1 * num2;
        }
        return 0;
    }
}