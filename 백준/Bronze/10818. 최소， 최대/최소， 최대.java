import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++){
            list.add(sc.nextInt());
        }

        for (int number : list){
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }
        System.out.println(min + " " + max);
    }
}