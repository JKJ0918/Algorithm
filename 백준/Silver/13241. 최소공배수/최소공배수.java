import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 최소 공배수
		// 최소 공배수 = 두 자연수의 곱 / 최대 공약수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());

		long g = gcd(a,b);
		
		long lcm = (a / g) * b; // 최소 공배수
		
		System.out.println(lcm);
	}
	
	// 최대공약수 구하기
	private static long gcd(long a, long b) {
		
		while(b != 0) {
			long r = a%b;
			a = b;
			b = r;
		}
		
		return a;
	}
	

}
