import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 띄어쓰기로 분리
		
		// 주사위 입력
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		
		if (a == b && b == c) {
		    // 세 수가 모두 같음
		    System.out.println(10000 + a * 1000);
		} else if (a == b || a == c || b == c) {
		    // 두 수만 같음
		    if (a == b || a == c) {
		        System.out.println(1000 + a * 100);
		    } else {
		        System.out.println(1000 + b * 100);
		    }
		} else {
		    // 모두 다름
		    int max = Math.max(a, Math.max(b, c));
		    System.out.println(max * 100);
		}

	}

}