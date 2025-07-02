import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// 세탁소 사장 동혁
		// 쿼터(Quarter, $0.25) / 다임(Dime, $0.10) / 니켈(Nickel, $0.05) / 페니(Penny, $0.01)
		// 거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 입력
	
		
		for(int i=0; i<t; i++) {
			
			int input = Integer.parseInt(br.readLine()); // 거스름돈 입력
			
			int left = input;
			
			// 동전 갯수
			int qt = 0;
			int di = 0;
			int ni = 0;
			int py = 0;	
		    
			
			if(left/25 > 0) { //Quarter 계산
				qt = (int) (left/25);
				left = (int) (left%25);
			}
			if(left/10 > 0) { //Dime 계산
				di = (int) (left/10);
				left = (int) (left%10);
			}
			if(left/5>0) { //Nickel 계산
				ni = (int) (left/5);
				left = (int) (left%5);
			}
			
			py = (int)(left/1); // Penny 계산
			sb.append(qt+" ");
			sb.append(di+" ");
			sb.append(ni+" ");
			sb.append(py);
			sb.append("\n");

		}
		System.out.println(sb);
	}// end main
	
}

// '/' 몫, '%' 나머지 연산
