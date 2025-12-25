import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // 백준 11660_구간 합 구하기 5
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 표의 크기 N
        int M = Integer.parseInt(st.nextToken()); // 구해야 하는 횟수 M

        long[][] sumArray = new long[N + 1][N + 1]; // 1-based, [0][*]는 0으로 둠

        // 2차원 누적합 입력
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());  // 매 행마다 새로 읽기
            for (int j = 1; j <= N; j++) {
                int value = Integer.parseInt(st.nextToken());
                sumArray[i][j] = sumArray[i - 1][j]    // 위쪽 누적
                               + sumArray[i][j - 1]    // 왼쪽 누적
                               - sumArray[i - 1][j - 1]// 겹친 부분 빼기
                               + value;                // 현재 값 더하기
            }
        }

        // 쿼리 처리 (O(1) per query)
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            long result = sumArray[x2][y2]
                        - sumArray[x1 - 1][y2]
                        - sumArray[x2][y1 - 1]
                        + sumArray[x1 - 1][y1 - 1];

            sb.append(result).append('\n');
        }

        System.out.print(sb);
    }
}
