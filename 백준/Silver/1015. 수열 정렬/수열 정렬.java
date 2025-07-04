import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];
        Pair[] B = new Pair[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 값과 원래 인덱스를 함께 저장
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = new Pair(A[i], i); // 값, 원래 인덱스
        }

        // 2. 값 기준으로 정렬 (stable sort)
        Arrays.sort(B, (a, b) -> Integer.compare(a.value, b.value));

        // 3. 정렬된 인덱스를 원래 위치에 기록
        int[] P = new int[n];
        for (int i = 0; i < n; i++) {
            P[B[i].index] = i;
        }

        // 4. 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(P[i]).append(" ");
        }
        System.out.println(sb);
    }

    // 값과 원래 인덱스를 저장할 클래스
    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
/*
단계	설명
A = [2, 3, 1, 2, 3]	입력 받음
B = [(2,0), (3,1), (1,2), (2,3), (3,4)]	값과 인덱스를 쌍으로 저장
B 정렬 = [(1,2), (2,0), (2,3), (3,1), (3,4)]	값 기준 정렬
P[2]=0, P[0]=1, P[3]=2, P[1]=3, P[4]=4	각 위치에 몇 번째인지 기록
P = [1, 3, 0, 2, 4]	최종 출력
*/