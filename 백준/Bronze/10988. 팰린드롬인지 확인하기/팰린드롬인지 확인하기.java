import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 팰린드롬인지 확인하기
		//앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		boolean isPalindrome = true;
		int len = input.length();
		
		for(int i=0; i<len/2; i++) {
			if(input.charAt(i) != input.charAt(len-1-i)) {
				isPalindrome = false;
				break;
			}
			
		}
		
		System.out.println(isPalindrome ?  1 : 0);
		
	}// end main

}
