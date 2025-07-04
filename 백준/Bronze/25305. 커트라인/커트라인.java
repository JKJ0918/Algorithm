import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 커트라인
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken()); // 응시자 수
		int m = Integer.parseInt(st.nextToken()); // 상 받는 인원
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) { // 응시자 점수 입력
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr); // 오름차순 정렬
		
		
		System.out.println(arr[n-m]);
		
		
	}

}
