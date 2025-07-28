import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static long factorial(long n) {
		if(n<=1) {
			return 1;
		}
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) throws IOException {
		// 팩토리얼 2
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine()); // 입력값
		
		System.out.println(factorial(n));
		
		

	}//end main

}
