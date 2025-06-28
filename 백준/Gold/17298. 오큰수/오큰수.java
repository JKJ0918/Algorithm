import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] answer = new int[n];
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // 스택에서 현재 값보다 작거나 같은 건 다 pop
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // 스택이 비었으면 오큰수가 없음 → -1
            if (stack.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = stack.peek();
            }

            // 현재 값을 스택에 push
            stack.push(arr[i]);
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int val : answer) {
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }
}
