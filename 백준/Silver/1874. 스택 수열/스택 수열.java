import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> st = new Stack<>(); // 스택 생성
        int n = Integer.parseInt(br.readLine()); // 반복할 수

        int current = 1; // 오름차순 숫자 (1부터 시작)
        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine()); // 원하는 수

            // target까지 숫자를 push
            while (current <= target) {
                st.push(current++); // current 를 넣은 후 ++가 동작
                sb.append("+\n"); // 문자열 추가
            }

            // 스택의 top이 target이면 pop
            if (!st.isEmpty() && st.peek() == target) { // peek() 맨 위를 확인하는 동작
                st.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) { //isPossible == True
            System.out.print(sb.toString()); // append 한 값을 최종 출력
        } else { // false
            System.out.println("NO");
        }
    }
}
