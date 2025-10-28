import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static int idx = 1;

    public static class Member {
        private final int order;
        private final int age;
        private final String name;

        public Member(int age, String name) {
            this.order = idx++;
            this.age = age;
            this.name = name;
        }

        public int getOrder() {
            return this.order;
        }

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        List<Member> members = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Member member = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
            members.add(member);
        }
        br.close();
        members.sort((a, b) -> {
            if (a.getAge() == b.getAge()) {
                return a.getOrder() - b.getOrder();
            }
            return a.getAge() - b.getAge();
        });
        for (Member member : members) {
            bw.write(member.getAge() + " " + member.getName() + "\n");
        }
        bw.flush();
        bw.close();
    }
}