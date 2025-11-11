import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 14681 번 문제 : 사분면 고르기
		// https://www.acmicpc.net/problem/14681

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		// x가 음수
		if(x<0) {
			
			if(y>0) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}
		
		// x가 양수
		if(x>0) {
			
			if(y>0) {
				System.out.println("1");
			} else {
				System.out.println("4");
			}
		}
 
		
	}

}
