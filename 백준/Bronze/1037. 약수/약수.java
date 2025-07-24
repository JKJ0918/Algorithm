import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 약수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 약수 개수

        int min = Integer.MAX_VALUE; // 처음에 가장 큰 값으로 초기화
        int max = Integer.MIN_VALUE; // 처음에 가장 작은 값으로 초기화

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if(num < min) {
            	min = num;
            }
            
            if(num > max) {
            	max = num;
            }
        }

        System.out.println(min * max); // 진짜 약수 중 최소 * 최대 = 원래 수 X
    }
}
