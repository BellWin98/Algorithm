import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0 ; i < 5; i++){
            list.add(sc.nextInt());
        }
        for (int number : list){
            sum += (int) Math.pow(number, 2);
        }
        System.out.println(sum % 10);
    }
}

