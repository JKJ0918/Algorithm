import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> dancers = new HashSet<>();
        dancers.add("ChongChong"); // 처음에 춤을 추는 사람

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            // 둘 중 하나라도 춤을 추고 있다면, 둘 다 추가
            if (dancers.contains(a) || dancers.contains(b)) {
                dancers.add(a);
                dancers.add(b);
            }
        }

        System.out.println(dancers.size());
    }
}

