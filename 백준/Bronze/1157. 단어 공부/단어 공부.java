import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// 단어 공부
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase(); // 대문자 변환
		
		int[] alpha = new int[26];
		
		//알파벳 등장 횟수 세기
		for(int i=0; i<word.length(); i++) {
			alpha[word.charAt(i) - 'A']++;
		}
		
		int max = 0; // 최대 등장 횟수
		char result = '?'; // 정답 문자
		
		// 최대 등장 알파벳 찾기
		for(int j=0; j<26; j++) {
			if(alpha[j]>max) {
				max = alpha[j];
				result = (char) (j+'A');
			} else if(alpha[j] == max) {
				result = '?'; // 같은 빈도수 ? 처리
			}
			
		}
		
		System.out.println(result);
		

	}// end main

}

// word.charAt(i) -> charAt(i)는 i번째 문자를 **문자(char)**로 꺼냄
// 'A'는 아스키코드 65 ex) 문자 C(아스키코드67, 인덱스2) 일 경우 -> 67(C) - 65(A) = 2 -> 2(인덱스) 
// alphabet[문자 - 'A']++의 의미 -> 알파벳을 인덱스로 변환한 뒤, 해당 자리에 +1 하면서 등장 횟수샘.
