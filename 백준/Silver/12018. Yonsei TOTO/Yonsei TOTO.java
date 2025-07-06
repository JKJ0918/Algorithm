import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// Yonsei TOTO
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st1.nextToken()); // 과목 수
		int m = Integer.parseInt(st1.nextToken()); // 보유 마일리지
		
		int[] result = new int[n]; // 컷트라인들을 담을 공간


		for(int i=0; i<n; i++) {
			
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st2.nextToken()); // 지원자 수
			int b = Integer.parseInt(st2.nextToken()); // 모집정원
			Integer[] arr = new Integer[a]; // 배열 생성
			
			StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<a; j++) { // 지원자들의 마일리지 값 입력
				arr[j] = Integer.parseInt(st3.nextToken());
			}
			
			Arrays.sort(arr, Collections.reverseOrder()); // 내림차순으로 정렬
			
			if (a <= b) {
			    result[i] = 1; // 최소 마일리지로 수강 가능
			} else {
			    result[i] = arr[b - 1]; // b번째로 높은 마일리지가 컷트라인
			}
			

		}// end for
		
		Arrays.sort(result);// 결과를 오름차순으로 정렬

		// 계산
		int count = 0;
		for (int i = 0; i < n; i++) {
		    if (m < result[i]) {
		        break;
		    } else {
		        m -= result[i];
		        count++;
		    }
		}
		
		System.out.println(count);
		
	}
	

}
