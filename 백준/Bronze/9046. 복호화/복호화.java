import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // 9046 복호화

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < n; t++) {
            String input = br.readLine();

            int[] alphabet = new int[26]; // 매 테스트 케이스마다 새로 생성

            // 1. 알파벳 빈도 세기
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                if (c == ' ') continue; // 공백은 무시
                int k = c - 'a';        // 'a' -> 0, 'b' -> 1 ...
                alphabet[k]++;          // 빈도 증가
            }

            // 2. 최빈값 찾기
            int max = 0;
            int maxIndex = -1;
            int maxCount = 0; // 최빈값을 가진 알파벳이 몇 개인지

            for (int i = 0; i < 26; i++) {
                if (alphabet[i] > max) {
                    max = alphabet[i];
                    maxIndex = i;
                    maxCount = 1; // 새로운 최대값 발견
                } else if (alphabet[i] == max && max != 0) {
                    maxCount++;   // 같은 최대값 하나 더 발견
                }
            }

            // 3. 출력 결정
            if (maxCount > 1) {
                sb.append("?").append('\n');
            } else {
                sb.append((char) ('a' + maxIndex)).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
