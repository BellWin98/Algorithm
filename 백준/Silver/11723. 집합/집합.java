import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            String command;
            int x = 0;
            if (str.contains(" ")) {
                st = new StringTokenizer(str);
                command = st.nextToken();
                x = Integer.parseInt(st.nextToken());
            } else {
                command = str;
            }
            switch (command) {
                case "add":
                    hs.add(x);
                    break;
                case "remove":
                    hs.remove(x);
                    break;
                case "check":
                    if (hs.contains(x)) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "toggle":
                    if (hs.contains(x)) {
                        hs.remove(x);
                    } else {
                        hs.add(x);
                    }
                    break;
                case "all":
                    for (int k = 1; k <= 20; k++) {
                        hs.add(k);
                    }
                    break;
                default:
                    hs.clear();
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}