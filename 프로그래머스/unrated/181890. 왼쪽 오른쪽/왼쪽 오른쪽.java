class Solution {
    public String[] solution(String[] str_list) {
        String temp = "";
        String letter = "";
        int index = -1;
        for (int i = 0; i < str_list.length; i++){
            if (str_list[i].equals("l") || str_list[i].equals("r")){
                index = i;
                letter = str_list[i];
                break;
            }
        }
        if (letter.equals("l")){
            for (int i = 0; i < index; i++){
                temp += str_list[i];
            }
        } else if (letter.equals("r")){
            for (int i = index + 1; i < str_list.length; i++){
                temp += str_list[i];
            }
        }
        if (index == -1 || temp.length() == 0){
            return new String[]{};
        }
        return temp.split("");
    }
}