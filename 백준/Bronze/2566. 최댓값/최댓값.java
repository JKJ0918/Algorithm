import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 최댓값
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[][] ary = new int[9][9]; // 2차원 배열 생성
		int n = 0; // 행 초기화
		int m = 0; // 열 초기화
		int max = 0; // 최댓값
		
		 // 배열에 값 입력
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 비교
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(max<=ary[i][j]) {
					max = ary[i][j];
					n = i+1;
					m = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(n+" "+m);
		
		
		
	}// end main
	

}
