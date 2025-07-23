import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// 팩토리얼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		
		int n = Integer.parseInt(br.readLine()); 
		int a = 1;
		
		if(n==0) {
			sb.append(a);
		}else {
			
			for(int i=1; i<n+1; i++) {
				
				a = a*i;
			}
			sb.append(a);
			
		}// end else
		System.out.println(sb);

	}// end main

}
