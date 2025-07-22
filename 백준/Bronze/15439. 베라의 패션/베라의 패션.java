import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// 베라의 패션
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 옷 벌수
		
		int total = 0;
		
		for(int i=1; i<n; i++) {
			total += i;
		}
		
		System.out.println(total*2);
	}

}
