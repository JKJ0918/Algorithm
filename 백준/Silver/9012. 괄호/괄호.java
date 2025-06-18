// 필요한 라이브러리 import
import java.io.BufferedReader;          // 입력을 효율적으로 받기 위해 사용
import java.io.InputStreamReader;       // 시스템의 기본 입력 스트림(System.in)을 문자로 읽을 수 있도록 함
import java.io.IOException;             // 예외 처리를 위해 사용
import java.util.Stack;                 // 괄호 짝을 검사하기 위한 스택

public class Main {

    public static void main(String[] args) throws IOException {
        
        // BufferedReader 생성: 한 줄씩 입력을 빠르게 받기 위한 객체
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // StringBuilder: 여러 줄 출력할 때 효율적으로 문자열을 붙이기 위해 사용
        StringBuilder sb = new StringBuilder();
        
        // 첫 줄 입력: 테스트 케이스 개수 입력 받음
        int T = Integer.parseInt(br.readLine());

        // T번 만큼 반복하며 각 테스트 케이스 처리
        for (int i = 0; i < T; i++) {
            // 각 줄의 괄호 문자열을 읽어서 solve() 메서드에 전달하고 결과 저장
            sb.append(solve(br.readLine())).append('\n');  // 🔴 오타 있었음: readLinde() → readLine()
        }

        // 모든 결과를 한꺼번에 출력
        System.out.println(sb);
    }

    // 괄호 문자열이 VPS(올바른 괄호 문자열)인지 검사하는 메서드
    public static String solve(String s) {
        
        // 문자(Character)를 저장할 스택 생성
        Stack<Character> stack = new Stack<>();

        // 문자열 s의 각 문자(char)를 하나씩 검사
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  // i번째 문자 추출

            if (c == '(') {
                // 여는 괄호는 무조건 push
                stack.push(c);
            } else if (stack.empty()) {
                // 닫는 괄호 ')'인데, 스택이 비어있다면 짝이 맞지 않음 → "NO"
                return "NO";
            } else {
                // 닫는 괄호 ')'이고, 스택에 '('가 있으므로 pop해서 짝 맞춤
                stack.pop();
            }
        }

        // 문자열 전체를 검사한 뒤
        if (stack.empty()) {
            // 스택이 비어있다면 모든 괄호가 짝이 맞았다는 뜻 → "YES"
            return "YES";
        } else {
            // 스택에 아직 '('가 남아 있다면 → 짝이 안 맞음 → "NO"
            return "NO";
        }
    }
}
