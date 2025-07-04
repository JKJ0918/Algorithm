import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		// 단어 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] str =  new String[n];
		
		for(int i=0; i<n; i++) { // 단어 입력
			str[i] = br.readLine();
		}
		
		
		// 문자열 길이를 기준으로 오름차순 정렬
		// 길이가 같을 경우 알파벳 순으로 정렬 (then ~~)
		Arrays.sort(str, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())); 
		
		// 중복 단어 삭제
		System.out.println(str[0]); // 첫단어 무조건 출력
		
		
		for(int i=1; i<n; i++) {
			if(!str[i].equals(str[i-1])) { // 이전 단어와 다르면 출력
				System.out.println(str[i]);
			}
			
		}
		
	}

}
