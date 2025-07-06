import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// 로프 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 주어진 로프의 수
		int[] arr = new int[n]; // 밧줄의 임계중량 배열
		
		for(int i=0; i<n; i++) { // 밧줄의 
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr); // 오름차순 정렬
		
		int max = 0;
		int nC = n;
		for(int i=0; i<n; i++) {
			if(arr[i]*nC>max) {
				max = arr[i]*nC;
			}
			nC--;
		}
		
		System.out.println(max);
		
		
	}// end main

}
