import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {              // 클래스 이름은 제출용 기준으로
    // 최대공약수: 유클리드 호제법
    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());   // 테스트 케이스 수
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int g = gcd(a, b);
            int lcm = (a / g) * b;    // 오버플로 방지를 위해 (a/g)*b

            sb.append(lcm).append('\n');
        }
        System.out.print(sb.toString());
    }
}
