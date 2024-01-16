import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int j = n - i - 1;
            int count = j;
            int star = n - j;
            while (count > 0){
                sb.append(" ");
                count--;
            }
            while (star > 0){
                sb.append("*");
                star--;
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}