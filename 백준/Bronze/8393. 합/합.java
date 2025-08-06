import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// n이 주어졌을 때, 1~n 값을 구하는 프로그램
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		// 처음에 n을 삭제 되도록 직접 연산을 했는데, for문에 영향을 줘서 따로 값을 넣어줌
		for(int i=0; i < n; i++) {
	
			int b = i+1;
			
			sum += b;


		}// end for
		
		System.out.println(sum);
	}// end main
	
}
