import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 0번째 인덱스는 0으로 초기화됨
        long[] sumArray = new long[n + 1]; 

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            // 현재 수 + 이전까지의 합을 저장
            sumArray[i] = sumArray[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 연산 시작
        for (int a = 0; a < m; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 공식: 구간 합 = sumArray[j] - sumArray[i-1]

            sb.append(sumArray[j] - sumArray[i - 1]).append("\n");
        }
        System.out.print(sb);
    }
}