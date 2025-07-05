import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 보물
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 배열의 크기 입력
		
		StringTokenizer stA = new StringTokenizer(br.readLine(), " "); // 배열 A 입력
		StringTokenizer stB = new StringTokenizer(br.readLine(), " "); // 배열 B 입력
		
		int[] arrA = new int[n]; // 배열 A 초기화
		int[] arrB = new int[n]; // 배열 B 초기화
		
		Pair[] pB = new Pair[n];

		
		for(int i=0; i<n; i++) { // 배열 A,B 입력
			arrA[i] = Integer.parseInt(stA.nextToken());
			arrB[i] = Integer.parseInt(stB.nextToken());
		}
		
		for(int i=0; i<n; i++) { // 배열 B 입력 및 배열 깂, 인덱스쌍 배열 생성
			pB[i] = new Pair(arrB[i], i);
		}
		
		// 배열 A 오름차순 정렬
		Arrays.sort(arrA); 
		// 배열 pB 내림차순 정렬
        Arrays.sort(pB, (a, b) -> Integer.compare(b.value, a.value));
		
        // arrA 재배열
		int[] reArrA = new int[n]; // 배열 B 초기화
        for(int i=0; i<n; i++) {
        	reArrA[pB[i].index] = arrA[i];
        }
        
        // 계산 S = A[0]xB[0]+...+A[n-1]xB[n-1]
        int total = 0;
        for(int i=0; i<n; i++) {
        	int sum = reArrA[i]*arrB[i];
        	
        	total += sum;
        }
        
        System.out.println(total);
        
        
	}// end main
	
	
	static class Pair{
		int value;
		int index;
		
		Pair(int value, int index){
			this.value = value;
			this.index = index;
		}
	}

	

}
