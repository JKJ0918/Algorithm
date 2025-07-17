import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        // 스택2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 명령의 수
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] tokens = input.split(" ");

            int cmd = Integer.parseInt(tokens[0]);

            switch (cmd) {
                case 1: // push
                    int x = Integer.parseInt(tokens[1]);
                    st.push(x);
                    break;
                case 2: // pop
                    sb.append(st.isEmpty() ? -1 : st.pop()).append("\n");
                    break;
                case 3: // size
                    sb.append(st.size()).append("\n");
                    break;
                case 4: // empty
                    sb.append(st.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 5: // top
                    sb.append(st.isEmpty() ? -1 : st.peek()).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
