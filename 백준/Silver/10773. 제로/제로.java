import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// 제로
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> st = new Stack<Integer>();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			int a = Integer.parseInt(br.readLine());

			if (a == 0) {
				st.pop();
			} else {
				st.push(a);
			}
			

		} // end for

		int total = 0;

		while(!st.isEmpty()) {
			total += st.pop();
		}



		System.out.println(total);
	}

}
