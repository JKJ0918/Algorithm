import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 중앙 이동 알고리즘
		
		// 상단의 점의 갯수가 기존 + (기존-1) 개로 증가됨
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()); // 단계
		
		int b = 2; // 상단 점의 갯수
		
		for(int i=0; i<a; i++) {
			
			b = b+(b-1);
		}
		System.out.println(b*b);

	}// end main

}
