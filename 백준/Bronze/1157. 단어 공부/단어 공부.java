import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        if (str.length() == 1){
            System.out.println(str.toUpperCase());
            return;
        }
        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c : map.keySet()){
            list.add(c);
        }
        if (list.size() == 1){
            System.out.println(Character.toUpperCase(list.get(0)));
            return;
        }
        list.sort((o1, o2) -> map.get(o2) - map.get(o1));
        if (map.get(list.get(0)).equals(map.get(list.get(1)))){
            System.out.println("?");
        } else {
            System.out.println(Character.toUpperCase(list.get(0)));
        }
    }
}