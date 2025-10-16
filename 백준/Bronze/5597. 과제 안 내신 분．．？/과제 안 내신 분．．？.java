import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> al = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            al.add(i);
        }
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            al.remove(Integer.valueOf(num));
        }
        System.out.println(al.get(0));
        System.out.println(al.get(1));
    }
}