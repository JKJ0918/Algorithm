import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 블랙잭
		// 딜러는 N 장의 카드를 모두 숫자가 보이도록 바닥에 놓는다.
		// 그런 후에 딜러는 숫자 M을 크게 외친다.
		// 플레이어는 N장의 카드중 3장을 골라 최대한 M과 가까운 값을 만들어야 한다. 단, M을 넘지 않으면서 최대한 가깝게 만들어야한다.
		// 풀이 -> 모든 경우의 수를 비교한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken()); // 카드의 수
		int m = Integer.parseInt(st.nextToken()); // 맞출 수
		
		String line = br.readLine(); // 숫자 입력 ex) 5 6 7 8 9
		
		String[] arr = line.split(" "); // 공백 기준으로 나눠 입력
		
		int[] nums =new int[arr.length];
		
		for(int i=0; i<arr.length; i++) { // 문자배열을 숫자 배열에 입력
			nums[i] = Integer.parseInt(arr[i]);
		}
		
		int apx = 0; // 근사값
		int a = 0;
		for(int i=0; i<n-2; i++) { 
			
			for(int j=i+1; j<n-1; j++) {
				
				for(int k=j+1; k<n; k++) {

					a = nums[i]+nums[j]+nums[k];
					if( apx<= a && a<=m) {
						apx = a;
					}
				}
			}
			
		}
		System.out.println(apx);
		
		

	}// end main

}
