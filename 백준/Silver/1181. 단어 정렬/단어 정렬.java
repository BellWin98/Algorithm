import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++){
            set.add(sc.next());
        }
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            list.add(iter.next());
        }
        list.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        list.stream().forEach(System.out::println);
    }
}