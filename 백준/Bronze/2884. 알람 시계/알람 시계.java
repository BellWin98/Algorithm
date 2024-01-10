import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt() - 45;

        if (minute < 0){
            minute += 60;
            hour -= 1;
        }

        if (hour < 0){
            hour += 24;
        }

        System.out.println(hour + " " + minute);
    }
}