import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // 백준_20437 문자열 게임 2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while(t-- > 0) {

            String w = br.readLine(); // 문자열
            int k = Integer.parseInt(br.readLine());  // 같은 문자의 개수 k

            // 1. 알파벳별 등장 위치 리스트 
            @SuppressWarnings("unchecked")
            List<Integer>[] pos = new ArrayList[26];
            for(int i=0; i<26; i++) {
                pos[i] = new ArrayList<>();
            }

            // 문자열을 한 번 순회하면서 위치 저장
            for (int i=0; i<w.length(); i++) {
                char ch = w.charAt(i);
                pos[ch - 'a'].add(i);
            }

            int minLen = Integer.MAX_VALUE; // 최소길이
            int maxLen = -1;                // 최대 길이

            // 2. 각 알파벳에 대해 k개씩 묶어보기
            for(int c=0; c<26; c++) {
                List<Integer> list = pos[c];

                // k 를 충족하지 못하는 문자 필터링 
                if(list.size() < k) continue;

                // 연속된 k개의 위치를 하나의 구간으로 보며 길이 계산
                for(int i=0; i <= list.size() - k; i++) {
                    int start = list.get(i);
                    int end = list.get(i + k - 1);
                    int len = end - start + 1;

                    if(len < minLen) minLen = len;
                    if(len > maxLen) maxLen = len;
                }
            }

            // 출력
            if(maxLen == -1) {
                sb.append("-1\n");
            } else {
                sb.append(minLen).append(" ").append(maxLen).append("\n");
            }

        }

        System.out.print(sb);
    }
}
