import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 분수합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		
		long a = Integer.parseInt(st1.nextToken()); // 분자
		long b = Integer.parseInt(st1.nextToken()); // 분모
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

		long c = Integer.parseInt(st2.nextToken()); // 분자
		long d = Integer.parseInt(st2.nextToken()); // 분모
		
        // 분수 합
        long num   = a * d + b * c;
        long denom = b * d;

        // 기약분수로 약분
        long g = gcd(num, denom);
        num   /= g;
        denom /= g;

        System.out.println(num + " " + denom);


	}// end main

	// 최대 공약수
	private static long gcd(long num, long denom) {
		
		while(denom != 0) {
			long r = num%denom;
			num = denom;
			denom = r;
		}

		return num;
	}
	
}
