import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int x = Integer.parseInt(br.readLine()); // 총 긍액
		int y = Integer.parseInt(br.readLine()); // 구매 물건 종류 수
		
		int total = 0; // 총 구매 금액
		
		for(int i=0; i<y; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken()); // 물건 개당 금액
			int b = Integer.parseInt(st.nextToken()); // 물건 구매 수량
			
			total = total + a*b;
		}
		if(total == x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
