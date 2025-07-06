import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 회의실 배정
		// 종료시간이 빠를 수록 다을 회의를 더 많이 진행할 수 있음
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 회의 수
		
		Pair[] table = new Pair[n];
		
		for(int i=0; i<n; i++) { // 값 입력
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			table[i] = new Pair(start, end);
		}
		
		// 정렬 기준 : 끝나는 시간이 빠른 순, 끝나는 시간이 같으면 시작 시간 빠른 순
		Arrays.sort(table, (a, b) -> {
			if(a.end == b.end) return Integer.compare(a.start, b.start);
			return Integer.compare(a.end, b.end);
		});
		
		int count = 0; // 회의 개수
		int endTime = 0; // 이전 회의 종료 시간
		
		for(int i=0; i<n; i++) {
			if(table[i].start >= endTime) { // 겹치지 않으면 회의 선택 (1 2) (2 3)
				endTime = table[i].end;
				count++;
			}
		}
		
		System.out.println(count);
		
	} //end main method
	
	
	static class Pair{ // 시작, 종료 시간 쌍
		int start;
		int end;
		public Pair(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

}
