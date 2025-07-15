import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 가로수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		// 기존 가로수 입력
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 1) 인접 간격 배열
		// ex) 1, 3, 7, 13 이면, 1~3 / 3~7 / 7 ~ 13 의 간격을 구함
		int[] diff = new int[n-1];
		for(int i=1; i<n; i++) {
			diff[i-1] = arr[i] - arr[i-1];
		}
		
		// 2) 간격들의 GCD
		// 모든값을 다 비교해봤을 때의 최대 공약수를 찾음
		int g = diff[0];
		for(int i=1; i<diff.length; i++) {
			g = gcd(g,diff[i]);
		}
		
        // 3) 전체 구간에 필요한 가로수 수
        int total = (arr[n - 1] - arr[0]) / g + 1;

        // 4) 추가로 심어야 할 가로수 수
        System.out.println(total - n);
        

	}//end main
	
	//최대 공약수
    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

}

