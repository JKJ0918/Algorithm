import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 재귀의 귀재
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // Test case 
		
		for (int i = 0; i < t; i++) {
			String input = br.readLine();
			int[] count = {0}; // 호출 횟수를 저장할 배열
			int result = isPalindrome(input, count);
			sb.append(result + " " + count[0] + "\n");
		}
		
		System.out.println(sb);
	}
	
	static int recursion(String s, int l, int r, int[] count) {
		count[0]++;  // 재귀 호출 횟수 증가
		if (l >= r) return 1; // 팰린드롬
		else if (s.charAt(l) != s.charAt(r)) return 0; // 다르면 팰린드롬 아님
		else return recursion(s, l+1, r-1, count);
	}
	
	static int isPalindrome(String s, int[] count) {
		return recursion(s, 0, s.length() - 1, count);
	}
}
