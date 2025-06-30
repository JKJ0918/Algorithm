import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 상근이의 지각 해결 
		// 45분 일찍 알람 설정하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int h = Integer.parseInt(st.nextToken()); // 시간
		int m = Integer.parseInt(st.nextToken()); // 분
		
		int newH = 0;
		int newM = 0;
		
		// 하루의 시작 -> 0:0 자정 (밤 12시) || 하루의 끝 -> 23:59(다음남 자정 1분전)
		
		int a = m-45; // 45 분을 빼줌
		
		if(a<0) {
			newM = 60+a;
			if(h == 0) {
				newH = 23;
			}else {
				newH = h-1;
			}
			 
		}else {
			newH = h;
			newM = a;
		}

		
		
		System.out.println(newH+" "+newM); // 최종 시간 : 분 출력
		
		
		
		
	}

	
}
