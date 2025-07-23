import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 이항 계수 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// 계산
		int ans = fac(n)/(fac(k)*fac(n-k));
		
		System.out.println(ans);
		
		
	}// end main

	public static int fac(int a) {
		int b = 1;
		if(a == 0) {
			return 1;
		}else {
			for(int i=1; i<a+1; i++) {
				
				b = b*i;

			}
			return b;
		}

	}// end fac
}
