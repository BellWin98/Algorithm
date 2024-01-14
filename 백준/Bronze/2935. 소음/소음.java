import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String A = sc.next();
        String op = sc.next();
        String B = sc.next();
        String max;
        String min;
        if (A.compareTo(B) >= 0){
            max = A;
            min = B;
        } else {
            max = B;
            min = A;
        }

        int zeroCount = min.length() - 1;

        if (op.equals("*")){
            sb.append(max);
            for (int i = 0; i < zeroCount; i++){
                sb.append("0");
            }
        } else {
            if (max.equals(min)){
                sb.append("2");
                for (int i = 0; i < A.length() - 1; i++) {
                    sb.append("0");
                }
            } else {
                for (int i = 0; i < max.length() - min.length(); i++){
                    sb.append(max.charAt(i));
                }
                sb.append(min);
            }
        }
        System.out.println(sb);
    }
}