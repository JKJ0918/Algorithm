import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 5585번 _ 거스름돈
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(br.readLine()); // 물건의 가격
		
		int price = 1000 - input; // 1000엔 지폐 - 물품 가격
		
		int[] coin = {500, 100, 50, 10, 5, 1}; // 잔돈 목록
		
		int count = 0;
		
		int remainder = 0;
		
		for(int i=0; i<6; i++) {
			
			int a = price/coin[i];
			price = price%coin[i];
			count += a;
		}
		
		System.out.println(count);
		
	}

}
