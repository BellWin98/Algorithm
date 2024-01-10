import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= count; i++){
            sb.append("*");
            System.out.println(sb);
        }
    }
}