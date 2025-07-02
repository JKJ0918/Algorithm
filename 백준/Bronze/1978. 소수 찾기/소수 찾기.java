import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 소수 찾기
		// 주어진 수 N개 중에서 소수가 몇 개인지 찾아 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 수의 갯수
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int count = 0; // 소수 갯수 카운트
		
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if (isPrime(num)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
	
	// 소수 판별 함수
	// n ~ 루트n 까지 찾아보면 됨
    public static boolean isPrime(int num) {
        if (num < 2) return false; // 0, 1은 소수 아님

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

}
