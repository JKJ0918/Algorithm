import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 분해합
		// 분해합을 N을 주면, 생성자를 구하고 생성자중 가장 작은 수를 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 분해합 입력
		int result = 0; // 생성자 저장
		
		// 연산 시작
		for(int i=0; i<n; i++) {
			
			String st = Integer.toString(i); // 문자로 받아옴
			String[] spl = st.split(""); // 분할하여 저장
					
			int[] arr = new int[spl.length]; // 길이만큼의 int 배열 생성
			for(int j=0; j<arr.length; j++) { // 분해된 문자를 다시 숫자로 변형하여 입력
				arr[j] = Integer.valueOf(spl[j]);
			}
			
			int a = 0;// 자릿수 합 저장
			// 분해합 시작
			for(int k=0; k<arr.length; k++) {
				a += arr[k];
			}
			int nn = a+i;
			
			if(nn == n) { // 결과 도출
				result = i;
				break; // for 문탈출
			}
			
			
		}// end for
		
		System.out.println(result);
		
		

	}// end main

}
