import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 10809
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int array[] = new int[26]; // 알파벳 배열
		
		Arrays.fill(array, -1); // 모든 값을 -1로 초기화
		
		String s = br.readLine(); // 문장 입력 받기
		
		for(int i=0; i<s.length(); i++) {
			
			int a =  s.charAt(i) - 'a';
			
			if(array[a] == -1) { // 첫 번째로 나타난 값만 처리
				array[a] = i;
			}

		}
		
		// 출력
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<26; i++) {
			sb.append(array[i]).append(" ");
		}
		
		System.out.println(sb.toString());
		
		
		

		
		
	}

}
