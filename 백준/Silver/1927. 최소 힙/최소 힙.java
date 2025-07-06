import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		// 최소 힙
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 오름차 순 정렬
		
		for(int i=0; i<n; i++) {
			
			int x = Integer.parseInt(br.readLine()); // 수 입력
			
			if(x==0) { 
				if(minHeap.isEmpty()) { // 힙이 비어있을 경우 '0'을 출력한다.
					sb.append("0\n");
				}else {
					sb.append(minHeap.poll()+"\n"); // 최소값 출력하고, 그 값을 제거
				}
				
			}else {
				minHeap.add(x);
			}

		}// end for
		
		System.out.println(sb);
	}// end main

}
