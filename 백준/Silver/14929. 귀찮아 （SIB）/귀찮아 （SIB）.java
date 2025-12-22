import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 14929 귀찮아 SIB
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] x = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long total = 0;
		
		
		for(int i=0; i<n; i++) {
			x[i] = Long.parseLong(st.nextToken()); // 배열 x에 값을 넣어줌
			total += x[i]; // 모든 입력값을 더함
		}
		
		long ans = 0;
		
		for(int i = 0; i<n; i++) {
			total -= x[i]; // 뒤에 남은 합
			ans += x[i] * total; // x[i]와 뒤 원소들 곱의 합
		}
		
		System.out.println(ans);
	}

}
