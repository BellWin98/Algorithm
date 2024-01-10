import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++){
            int number = sc.nextInt();
            map.put(number, i + 1);
        }
        for (int key : map.keySet()){
            if (key > max){
                max = key;
            }
        }
        System.out.println(max);
        System.out.println(map.get(max));

    }
}

