import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에서 테스트 케이스의 수를 입력받음
        int n = Integer.parseInt(br.readLine());

        // 테스트 케이스 수만큼 반복
        for (int i = 0; i < n; i++) {
            // 한 줄을 입력받아 공백 기준으로 단어를 나눔
            String[] words = br.readLine().split(" ");

            // 나눠진 각 단어에 대해 처리
            for (String word : words) {
                // StringBuilder를 이용해 문자열 뒤집기
                StringBuilder sb = new StringBuilder(word);
                System.out.print(sb.reverse().toString() + " "); // 뒤집은 단어 출력 + 공백
            }
            // 한 줄 처리 끝났으므로 줄바꿈
            System.out.println();
        }

        // BufferedReader 닫기
        br.close();
    }
}
