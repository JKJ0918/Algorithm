import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// 별찍기
	public static void main(String[] args) throws IOException { 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
					
		int n = Integer.parseInt(br.readLine()); // 반복수
		int vac = n-1; // 공백
		int sta = 1; // 별찍기
		
		// 상단출력
		for(int up=0; up<n; up++) { 
			
			
			
			for(int i=0; i<vac; i++) { // 공백 생성
				sb.append(" ");
			}
			for(int j=0; j<sta; j++) {
				sb.append("*");
			}
			
			if(vac != 0) {
				
				sta = sta + 2;
			}
			vac--;

			sb.append("\n"); // 줄바꿈
		}

		// 하단 출력
		for(int dn=0; dn<n-1; dn++) {
			
			vac++;
			sta = sta - 2;
			
			for(int i=0; i<=vac; i++) { // 공백 생성
				sb.append(" ");
			}
			for(int j=0; j<sta; j++) {
				sb.append("*");
			}
			sb.append("\n"); // 줄바꿈
			
		}
		
		
		System.out.println(sb);
		

		
		

	}// end main

}
