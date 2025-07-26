import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 시험 성적
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		
		if( n >= 90 && n < 101) {
			sb.append("A");
		}else if(n >= 80 && n < 90) {
			sb.append("B");
		}else if(n >= 70 && n < 80) {
			sb.append("C");
		}else if(n >= 60 && n < 70) {
			sb.append("D");
		}else {
			sb.append("F");
		}
		
		System.out.println(sb);

	}// end main

}
