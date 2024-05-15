import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class UserInfo {
        private final int id;
        private final String name;
        private final int age;

        UserInfo(int id, String name, int age){
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId(){
            return id;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<UserInfo> userInfos = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        int id = 1;
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            UserInfo userInfo = new UserInfo(id++, name, age);
            userInfos.add(userInfo);
        }

        // 다중 조건 정렬 (나이 오름차순 -> 가입 순서 오름차순) 
        userInfos.sort(Comparator.comparing(UserInfo::getAge).thenComparing(UserInfo::getId));

        for (UserInfo userInfo : userInfos){
            System.out.println(userInfo.getAge() + " " + userInfo.getName());
        }
    }
}