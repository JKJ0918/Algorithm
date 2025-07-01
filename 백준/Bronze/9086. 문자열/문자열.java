import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine()); // 테스트 수
		

		
		for(int i=0; i<a; i++) { // for 문은 한 바퀴를 돌면 사라지는 특징이 있음
			
			String str = br.readLine();
			String[] strAry = str.split("");
			
			sb.append(strAry[0]+strAry[strAry.length-1]+"\n");
			
		}
		
		System.out.println(sb);
	
		
		
	}//end main

}
