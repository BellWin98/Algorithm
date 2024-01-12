import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++){
            String str = sc.nextLine();
            String[] sp = str.split(" ");
            double number = Double.parseDouble(sp[0]);
            for (int idx = 1; idx < sp.length; idx++){
                if (sp[idx].equals("@")){
                    number *= 3;
                } else if (sp[idx].equals("%")){
                    number += 5;
                } else {
                    number -= 7;
                }
            }
            System.out.printf("%.2f\n", number);
        }
    }
}