import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = A * B * C;
        String str = String.valueOf(result);
        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < 10; i++){
            if (map.containsKey(Integer.toString(i).charAt(0))){
                System.out.println(map.get(Integer.toString(i).charAt(0)));
            } else {
                System.out.println(0);
            }
        }
    }
}