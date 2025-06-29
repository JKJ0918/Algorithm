import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    Stack<Character> stack = new Stack<>();
    int result = 0;

    for (int i = 0; i < input.length(); i++) {
      char current = input.charAt(i);

      if (current == '(') {
        stack.push(current);
      } else {
        stack.pop(); // ')'에 대응되는 '(' 하나 제거

        if (input.charAt(i - 1) == '(') {
          // 레이저인 경우
          result += stack.size(); // 현재 열려 있는 막대기 개수만큼 잘림
        } else {
          // 쇠막대기 끝
          result += 1; // 끝났으니 조각 하나 추가
        }
      }
    }

    System.out.println(result);
  }
}
