import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> heap = new PriorityQueue<>(); // 최소 힙
		
		for(int i = 0; i < n; i++) {
			heap.add(Integer.parseInt(br.readLine())); // 카드 묶음 입력
		}
		
		int total = 0;
		
		while (heap.size() >= 2) {
			int a = heap.poll();
			int b = heap.poll();
			int sum = a + b;
			total += sum;
			heap.add(sum);
		}
		
		System.out.println(total);
	}
}
