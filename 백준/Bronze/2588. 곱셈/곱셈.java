import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 곱셈
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
 		int a = Integer.parseInt(br.readLine());
 		String b = br.readLine();
		
 		// 각 자리수
 		int ones = b.charAt(2)-'0';
 		int tens = b.charAt(1)-'0';
 		int hundreds = b.charAt(0)-'0';

		sb.append(a*ones).append("\n");
		sb.append(a*tens).append("\n");
		sb.append(a*hundreds).append("\n");
		sb.append(a*Integer.parseInt(b)).append("\n");
		
		System.out.println(sb);
		
		
		
	}// end main

}
