import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 11653 소인수분해 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 입력받는 정수
		
		int a = 2; // 처음 나눌 소수
		
		List<Integer> share = new ArrayList<>(); // 몫들을 담음
		
		// 아무것도 출력하지 않음
		if(n == 1) {
			
		}else {
			// n이 1이 아닐 경우 계산
			
			// 나머지가 1이면 종료
			while(n > 1) {
				
				if(n%a == 0) {
					
					share.add(a); // 몫을 입력	
					n = (n/a); // n 값 갱신
					a = 2; // 나누는 수 초기화

							
				} else {
					// 나누어지지 않을 경우 a를 증가
					a++;
				}
				
				
			} // end  while
		
			// 배열 오름차순 정렬
			Collections.sort(share);
			
			// 출력
			for(int i=0; i<share.size(); i++) {
				System.out.println(share.get(i));
			}
			
		} // end else
		


	}

}
