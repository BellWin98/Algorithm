import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++){
            int count = sc.nextInt();
            String str = sc.next();
            for (char c : str.toCharArray()){
                for (int k = 0; k < count; k++){
                    sb.append(c);
                }
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}