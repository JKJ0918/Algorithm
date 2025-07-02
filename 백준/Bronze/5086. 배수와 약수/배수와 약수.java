import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 배수와 약수
		// 첫번째 숫자는 두번째 숫자의 무엇인가?
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken()); // 첫번째 수
			int b = Integer.parseInt(st.nextToken()); // 두번째 수
			
			if(a==0 && b==0) {
				break;
			}
			
			if(a%b == 0) { // 배수
				sb.append("multiple");
			}else if(b%a == 0) { // 약수
				sb.append("factor");
			}else {
				sb.append("neither");
			}

			sb.append("\n");

			
		}
		
		System.out.println(sb);

	}

}
