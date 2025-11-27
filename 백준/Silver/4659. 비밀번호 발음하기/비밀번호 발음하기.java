import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 4659번 비밀번호 발을하기
		// 출처 https://karen0117.tistory.com/147
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = "";
		
		while(!(input = br.readLine()).equals("end")) { // input이 end 가 아닐경우 진행
		
			boolean isVowel = false; // 모음
			boolean isSeqVowelOrConsonant = false; // 모음 자음
			boolean isSeqSame = false; // 같음
			
			int vowelCnt = 0; // 모음 수 세기
			int consonantCnt = 0; // 자음 수 세기
			
			for(int i=0; i<input.length(); i++) {
				char c = input.charAt(i); // 글자 추출
				
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // 모음 필터
					isVowel = true;
					vowelCnt++;
					consonantCnt = 0;
				} else {
					consonantCnt ++;
					vowelCnt = 0;
				}
				
				if (vowelCnt >= 3 || consonantCnt >= 3) { // 자음 또는연 모음 연속 3자 나와 검증 종료 처리
					isSeqVowelOrConsonant = true;
					break;
				}
				
				if(i < input.length() - 1 ) { // 같은 문자 중복 검증
					char c2 = input.charAt(i+1);
					if(c == c2) {
						if(c != 'e' && c != 'o') { // e 또는 o 의 경우 검증 종료
							isSeqSame = true;
							break;
						}
					}
				}
			}
			
			bw.write("<" + input + "> is ");
			if(!isVowel || isSeqVowelOrConsonant || isSeqSame) {
				bw.write("not acceptable.\n");
			} else {
				bw.write("acceptable.\n");
			}
			
		}
		
		bw.flush();
	
	}

}
