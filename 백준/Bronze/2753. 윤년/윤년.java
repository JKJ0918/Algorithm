import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 윤년
		// 윤년은 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine()); // 연도 입력 
		
		// 윤년 계산
		if(n%4==0 && n%100!=0 || n%400==0 ) {
			sb.append("1");
		}else {
			sb.append("0");
		}
		
		System.out.println(sb);
		
		

	}// end main

}
