import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 좌표 정렬하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 점의 수
		StringBuilder sb = new StringBuilder();
		
		Pair[] arr = new Pair[n];
		
		for(int i=0; i<n; i++) { // 점의 좌표 입력
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[i] = new Pair(x, y);
		}
		
		Arrays.sort(arr, (a, b)->{
			if(a.x == b.x) {
				return Integer.compare(a.y, b.y);
			}
			return Integer.compare(a.x, b.x);
		});
		
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i].x+" "+arr[i].y+"\n");
		}
		
		System.out.println(sb);
		
		
	}// end main
	
	static class Pair{
		int x;
		int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
