import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 22864 - 피로도 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = 24; // 하루 24 시간
		int A = Integer.parseInt(st.nextToken()); // 1시간 작업시 소모되는 피로도
		int B = Integer.parseInt(st.nextToken()); // 1시간 작업시 생성되는 작업량
		int C = Integer.parseInt(st.nextToken()); // 1시간 휴식시 회복되는 피로도
		int M = Integer.parseInt(st.nextToken()); // 최대 피로도 한계점 초과되면 번아웃 0 까지는 버팀
		int stressgage = 0; // 피로도 임계값을 Life로 보고, 이걸 가지고 조절할 예정 입력받은 M은 대조용 자료로 사용 
		int work = 0; // 작업량
		// 0이 되는 시점까지 계산
		while(hour > 0) {
			
			// 일이 불가능 한 경우 (예외처리)
			if(A > M) {
				break;
			}else if((stressgage + A) <= M) { // 일이 가능한 경우
				work += B; // 작업량 증가
				stressgage += A; // 피로도 증가
			} else {
				// 작업이 불가능할 경우 휴식 진행
				stressgage -= C;
			}
			// stressgage 보정
			if(stressgage < 0) {
				stressgage = 0;
			}
			
			hour--; // 어떤 행동이던, 종료되면 1시간 소모
		}
		
		System.out.println(work);
		

	}

}
