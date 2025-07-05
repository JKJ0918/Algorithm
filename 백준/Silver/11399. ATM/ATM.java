import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// ATM
		// 가장 소요시간이 적게 걸리는 인원이 앞으로 오는 것이 빠름
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 받을 수 입력
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n]; // 각 사람마다 걸리는 시간을 넣음
		Pair[] arrP = new Pair[n]; // 
		
		for(int i=0; i<n; i++) { // 배열 입력과 인덱스를 한번에 저장
			arr[i] = Integer.parseInt(st.nextToken());
			arrP[i] = new Pair(arr[i], i); // 값, 사람 순번
		}
		
		// 값을 기준으로 정렬
		Arrays.sort(arrP, (a, b) -> Integer.compare(a.value, b.value));
		// Arrays.sort(arrP, 배열 arrP를 정렬하겠다.
		// 두 객체 a, b를 비교 (a, b) -> Integer.compare(a.value, b.value)
		// a.value가 b.value보다 작으면 -1
		// a.value가 b.value보다 크면 +1
		// 같으면 0
		// → 즉, 오름차순 정렬 기준

		// 정렬된 인덱스를 원래 위치에 기록
		int[] P = new int[n];
		for(int i=0; i<n; i++) {
			P[i] = arrP[i].value;
		}
		
		int total = P[0];
		int r = 1;
		// 합연산
		for(int i=1; i<n; i++) {
			int sum = 0;
			for(int j=0; j<=r; j++) {
				sum += P[j];
			}
			r++;
			total += sum;
		}
		
		System.out.println(total);
		
		
	} // end main
	
	static class Pair {
		
		int value; // 소요시간
		int index; // 사람의 순번
		
		Pair(int value, int index){
			this.value = value;
			this.index = index;
		}
	}
	
}
