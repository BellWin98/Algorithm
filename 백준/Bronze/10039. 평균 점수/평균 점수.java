import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        for (int number : arr){
            if (number < 40){
                number = 40;
            }
            total += number;
        }
        System.out.println(total / 5);
    }
}