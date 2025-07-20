import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		Stack<Integer> stack = new Stack<>();
		int next = 1; // 다음 간식 받을 번호

		for (int i = 0; i < n; i++) {
			int cur = Integer.parseInt(st.nextToken());

			// 현재 번호가 다음 순서면 바로 간식
			if (cur == next) {
				next++;
			} else {
				// 스택에 있는 친구가 간식 받을 차례라면 꺼냄
				while (!stack.isEmpty() && stack.peek() == next) {
					stack.pop();
					next++;
				}
				// 현재 학생은 스택에 보냄
				stack.push(cur);
			}
		}

		// 남은 스택 처리
		while (!stack.isEmpty() && stack.peek() == next) {
			stack.pop();
			next++;
		}

		System.out.println(stack.isEmpty() ? "Nice" : "Sad");
	}
}
