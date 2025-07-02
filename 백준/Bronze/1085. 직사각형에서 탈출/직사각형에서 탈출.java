import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// 직사각형에서 탈출
		// 현수 위치에서 사장 가까운 곳을 찾으면 됨, 대각선 제외, 동일할 경우 둘 중 아무거나출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 현수 좌표
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		// 직사각형 우상단 꼭짓점 위치
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int min = h-y;
		// 우
		if(w-x < min) {
			min = w-x;
		}
		// 하
		if(y < min) {
			min = y;
		}
		// 좌
		if(x < min) {
			min = x;
		}
		
		System.out.println(min);
		
	}//end main
	
}