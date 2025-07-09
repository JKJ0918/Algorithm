import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		// 문자열의 집합
		// hashSet 이용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		HashSet<String> set = new HashSet<>(); // 문자열 집합 S
		
		// 집합 S 입력
		for(int i=0; i<n; i++) {
			set.add(br.readLine());
		}
		
		int count = 0; // 집합에 포함된 문자열 수
		// 검사할 문자열 입력 및 확인
		for(int i=0; i<m; i++) {
			String word = br.readLine();
			if(set.contains(word)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}// end main

}
