import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.strip();
        String[] sp = str.split(" ");
        if (sp[0].isEmpty()){
            System.out.println(sp.length - 1);
        } else {
            System.out.println(sp.length);
        }
    }
}