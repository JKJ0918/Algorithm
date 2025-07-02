import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 달팽이는 올라가고 싶다
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken()); // 낮에 올라감
		int b = Integer.parseInt(st.nextToken()); // 밤에 미끄러짐
		int v = Integer.parseInt(st.nextToken()); // 나무의 높이
		
		int day = (v - b) / (a - b); // (마지막 날 아침에 꼭대기에 도달해도 미끄러지지 않기 위해 필요한 최소 높이) / (하루 진행량)
		
		// 정확히 나누어 떨어지지 않으면 하루 더 필요
		if ((v - b) % (a - b) != 0) {
			day++;
		}
		
		System.out.println(day);
	}
}