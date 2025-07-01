import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine(); // 알파벳 문자열 입력
		
		int find = Integer.parseInt(br.readLine()); // 몇번째 문자를 찾을 건지
		
		String[] word = input.split(""); // 한 글자씩 분리
		
		System.out.println(word[find-1]);

		

	}// end main

}
