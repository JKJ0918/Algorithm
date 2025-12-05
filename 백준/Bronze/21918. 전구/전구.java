import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // 백준 21918
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 전구의 개수 n
        int m = Integer.parseInt(st.nextToken()); // 명령어 개수 m

        int[] arr = new int[n]; // 전구 배열 생성

        // 전구 상태 입력
        st = new StringTokenizer(br.readLine());
        for (int a = 0; a < n; a++) {
            arr[a] = Integer.parseInt(st.nextToken());
        }

        // 명령 실행
        for (int i = 0; i < m; i++) {  // m번 반복
            st = new StringTokenizer(br.readLine());

            int j = Integer.parseInt(st.nextToken()); // 명령어 종류
            int d = Integer.parseInt(st.nextToken()); // 항목 1
            int k = Integer.parseInt(st.nextToken()); // 항목 2

            // 1번 명령어: d번째 전구를 k 상태로
            if (j == 1) {
                arr[d - 1] = k;  // ✅ 1-based → 0-based
            }

            // 2번 명령어: d ~ k번 전구 상태 반전
            else if (j == 2) {
                for (int x = d - 1; x <= k - 1; x++) {  // ✅ 구간 포함
                    arr[x] = (arr[x] == 1) ? 0 : 1;
                }
            }

            // 3번 명령어: d ~ k번 전구 끄기 (0)
            else if (j == 3) {
                for (int x = d - 1; x <= k - 1; x++) {
                    arr[x] = 0;
                }
            }

            // 4번 명령어: d ~ k번 전구 켜기 (1)
            else if (j == 4) {
                for (int x = d - 1; x <= k - 1; x++) {
                    arr[x] = 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < n; y++) {
            sb.append(arr[y]).append(" ");
        }

        System.out.println(sb.toString());
    }
}
