import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1152 - 단어의 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();  // 문자열을 입력 받음
		
		StringTokenizer st = new StringTokenizer(str); // 문자열을 토큰(단어)으로 분리
		
		int result = st.countTokens();
		
		System.out.println(result);
		
	}

}
