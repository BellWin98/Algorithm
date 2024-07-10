import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    /**
     * 1. 모든 숫자를 List에 담는다.
     * 2. 리스트를 오름차순 정렬한다.
     * 3. 리스트 0번째와 마지막 인덱스의 value끼리 곱한다.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> numberList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while (st.hasMoreTokens()) {
            numberList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(numberList);

        System.out.println(numberList.get(0) * numberList.get(N - 1));
    }
}