import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 14719 빗물 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken()); // 2차원 셰계의 세로길이 h
		int w = Integer.parseInt(st.nextToken()); // 2차원 세계의 가로길이 w
		
		// 자바에서 배열은 객체(Object)로 판단 하여, 객체 생성시 JVM이 기본값으로 0으로 초기화함.
		int[][] space =  new int[h][w]; // 공간 배열 생성 높이>행, 너비>열 
		
		// 블록이 쌓인 높이 입력
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<w; i++) {
			
			int height = Integer.parseInt(st.nextToken());
			for(int j=0; j<height; j++) {
				space[j][i] = 1;
			}
		}
		
		// 0:off, 1:on, 2: check
		int status = 0;
		int count = 0;
		int result = 0;
		
		// 계산
		for(int a=0; a<h; a++) {
			
			for(int b=0; b<w; b++) {
				
				if(space[a][b] == 1) {
					status += 1;
				}
				
				if( status == 1 && space[a][b] == 0 ) {
					count += 1; // 고인물 체크(누적)
				}
				
				if( status == 2 ) {
					result += count;
					count = 0; // 누적 빗물 초기화
					status = 1;
				}
			}
			
			status = 0;
			count = 0;
			
		}
		
		
		System.out.println(result);
		
	}
	

}
