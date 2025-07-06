import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> {
                if (Math.abs(a) == Math.abs(b)) {
                    return a - b; // 절댓값 같으면 작은 수(음수) 우선
                }
                return Math.abs(a) - Math.abs(b); // 절댓값 기준 정렬
            }
        );
        //a-b -> 오름차순 정렬
        // b-a -> 내림차순 정렬

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (heap.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(heap.poll()).append("\n");
                }
            } else {
                heap.add(x);
            }
        }

        System.out.print(sb);
    }
}
