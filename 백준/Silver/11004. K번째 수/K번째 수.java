import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// K번째 수
		// 오름차 순으로 정렬 후 k 번째 있는 수 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken()); // 입력할 자리수 
		int k = Integer.parseInt(st.nextToken()); // 찾을 번째 수
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n]; // 배열생성
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(arr); // 오름차 순
		
		System.out.println(arr[k-1]);
		
		

	}

}
