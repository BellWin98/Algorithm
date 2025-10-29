import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        while (st.hasMoreTokens()) {
            if (binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
        bw.close();
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key > arr[mid]) {
                low = mid + 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}