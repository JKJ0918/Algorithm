import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// 진법 변환
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		String N = input[0]; // 입력 문자열
		int B = Integer.parseInt(input[1]); // 진법
		
		int result = 0;
		int power = 1; // 현재 자리수의 B의 제곱(오른쪽 부터 올라감)
		
		for(int i = N.length()-1; i>=0; i-- ) {
			char c = N.charAt(i);
			
			int value;
			if (c >= '0' && c <= '9') { // 숫자인 경우
				value = c - '0';
			} else { // 문자인 경우
				value = c - 'A' + 10;
			}
			
			result += value * power;
			power *= B;
			
		}
		
		System.out.println(result);
	}
	
}

// 1A = (1 × 16¹) + (10 × 16⁰) = 16 + 10 = 26
// 간단한 풀이
// Java가 제공하는 진법 변환 함수
// int result = Integer.parseInt(N, B); // B진법을 10진법으로 변환