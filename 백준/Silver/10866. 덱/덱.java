import java.util.Deque;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dq = new LinkedList<>(); // 덱 생성
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");

            if (cmd.length == 2) {
                int x = Integer.parseInt(cmd[1]);
                if (cmd[0].equals("push_front")) {
                    dq.addFirst(x);
                } else if (cmd[0].equals("push_back")) {
                    dq.addLast(x);
                }
            } else {
                switch (cmd[0]) {
                    case "pop_front":
                        sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
                        break;
                    case "pop_back":
                        sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
                        break;
                    case "size":
                        sb.append(dq.size()).append("\n");
                        break;
                    case "empty":
                        sb.append(dq.isEmpty() ? 1 : 0).append("\n");
                        break;
                    case "front":
                        sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append("\n");
                        break;
                    case "back":
                        sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
                        break;
                }
            }
        }

        System.out.print(sb); // 딱 한 번만 출력
    }
}
