class Solution {
    public String solution(String new_id) {
        new_id = toLowerCase(new_id);
        new_id = removeUnnecessaryChar(new_id);
        new_id = convertStringToOnePeriod(new_id);
        new_id = removeStartAndEndPeriod(new_id);
        if (new_id.isEmpty()){
            new_id = "a";
        }
        if (new_id.length() >= 16){
            new_id = new_id.substring(0, 15);
            new_id = removeStartAndEndPeriod(new_id);
        }

        if (new_id.length() <= 2){
            StringBuilder sb = new StringBuilder();
            for (char c : new_id.toCharArray()){
                sb.append(c);
            }

            while (sb.length() <= 2){
                sb.append(new_id.charAt(new_id.length() - 1));
            }

            new_id = sb.toString();
        }

        return new_id;
    }
    
    // 모든 대문자를 소문자로 치환
    public static String toLowerCase(String input){
        return input.toLowerCase();
    }

    // 특정 문자 제외한 모든 문자 제거
    public static String removeUnnecessaryChar(String input){
        String unnecessaryChars = "~!@#$%^&*()=+[{]}:?,<>/";

        for (char unnecessaryChar : unnecessaryChars.toCharArray()){
            input = input.replace(unnecessaryChar, ' ');
        }

        return input.replace(" ", "");
    }

    // 마침표 2개 이상 -> 하나로 치환
    public static String convertStringToOnePeriod(String input){
        StringBuilder sb = new StringBuilder();

        boolean isPreviousPeriod = false;
        for (char c : input.toCharArray()){
            if (c == '.'){
                if (!isPreviousPeriod){
                    sb.append(c);
                    isPreviousPeriod = true;
                }
            } else {
                sb.append(c);
                isPreviousPeriod = false;
            }
        }

        return sb.toString();
    }

    // 문자열 앞뒤 마침표 제거
    public static String removeStartAndEndPeriod(String input){

        while (input.startsWith(".")) {
            input = input.substring(1);
        }

        while (input.endsWith(".")){
            input = input.substring(0, input.length() - 1);
        }

        return input;
    }
}