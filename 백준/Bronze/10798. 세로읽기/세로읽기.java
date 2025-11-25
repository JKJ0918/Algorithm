import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 10798번: 세로읽기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] array = new String[15]; // 문자가 들어갈 방

		// 입력은 5번 주어짐
		for(int i=0; i<5; i++) {
			String input = br.readLine(); // 문장 입력
			
			for(int j=0; j<input.length(); j++) { // 입력된 문장을 배열 자리에 배치
				if(array[j] == null) {
					array[j] = String.valueOf(input.charAt(j));
				}else {
					array[j] += input.charAt(j);
				}

			}
		}
		
		// 문장 만들기
		StringBuilder sb = new StringBuilder();
		
		for(int k=0; k<15; k++) {
			if(array[k] == null) {
				break;
			}
			sb.append(array[k]);
		}
		
		System.out.println(sb);

	}

}
