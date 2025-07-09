import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 10815
		// 이분 탐색 사용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 상근이의 카드 개수
		int [] cards = new int[n];
		
		// 카드 숫자 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		// 상근이 카드 정렬
		Arrays.sort(cards);
		
		// 찾을 숫자의 갯수
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
        // 각 숫자에 대해 이분 탐색 수행
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (binarySearch(cards, target)) {
                sb.append("1 "); // true;
            } else {
                sb.append("0 "); // false
            }
        }

        System.out.println(sb.toString().trim());
    }
	
	// 이분 탐색 함수
	public static boolean binarySearch(int[] arr, int key) { //cards, target
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) { // 0 <= arr.length
			int mid = (left + right)/2;
			
			if(arr[mid] == key) { // 배열의 중앙 탐색 시작
				return true;
				
			} else if(arr[mid] < key) { // 큰수는 우측에 있으므로 mid +1 
				left = mid + 1 ;
			} else { // 작은 수는 좌측에 있으므로 -1으로 왼쪽으로 탐색
				right = mid - 1;
			}
		}
		
		return false;
	}
	
	
}
