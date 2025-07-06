import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		// 최대 힙
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine()); // 명령 개수
		
		//
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		// 자바의 PriorityQueue는 최소 Heap임 최대 힙으로 써주기 위해 정렬기준 변화 Collections.reverseOrder()
		
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				if(maxHeap.isEmpty()) {
					sb.append("0\n");
				} else {
					sb.append(maxHeap.poll()).append("\n"); // 최대값 추출하고 해당 값 제거 poll() 사용
				}
			} else {
				maxHeap.add(x); // 힙에 값 추가
			}
			
		}// end for

		System.out.println(sb);
		
	}// end main

}
