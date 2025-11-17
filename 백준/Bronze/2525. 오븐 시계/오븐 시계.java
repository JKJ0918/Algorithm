import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 2525번 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int hour = Integer.parseInt(st.nextToken()); // 시간 
		int minutes = Integer.parseInt(st.nextToken()); // 분
		int working = Integer.parseInt(br.readLine()); // 소요 시간
		
		int totalMinutes = minutes + working;
		int hourPlus = totalMinutes/60;
		int minutesLeft = totalMinutes%60;
		
		int resultHour = hour + hourPlus;
		
		if(resultHour>=24) {
			resultHour = resultHour - 24;
		}
		
		System.out.println(resultHour+" "+minutesLeft);
		

	}

	
}
