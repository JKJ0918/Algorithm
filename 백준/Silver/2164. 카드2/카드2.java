import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		// 카드 2
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> qu = new LinkedList<>(); // 큐 선언
		
		// Queue 값 입력
		for(int i=1; i<=n; i++) {
			qu.offer(i);
		}
		
		// 연산 시작
		while(true) {
			if(qu.size() == 1) {
				break;
			}
			
			qu.poll(); // 맨 위 제거
			qu.offer(qu.poll()); // 그 다음걸 맨 아래로
			
		}


		
		System.out.println(qu.peek());
		

	}// end main

}
