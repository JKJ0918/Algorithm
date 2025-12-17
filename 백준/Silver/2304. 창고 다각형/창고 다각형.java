import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int N, sum;
	static List<Info> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		// 백준 2304 - 창고 다각형
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		// list 에 기둥 정보 입력
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int L = Integer.parseInt(st.nextToken()); // x 좌표
			int H = Integer.parseInt(st.nextToken()); // 높이
			
			list.add(new Info(L,H));
		}
		
		// 위치 기준으로 오름차순 정렬
		Collections.sort(list, (o1, o2) -> o1.x - o2.x);
		
		sum = 0; 	   // 창고 면적 누적 저장
		int pivot = 0; // 가장 높은 기둥의 위치 *pivot은 중심점이라는 뜻이 있음 기준 정도.
		
		// 1. 좌측 부터 계산 : [0, pivot]
		Info highC = list.get(0); // 맨 왼쪽 끝 기둥을 기준으로 시작
		for(int i = 1; i<list.size(); i++) {
			Info curC = list.get(i); // i 번째 기둥 정보 추출
			
			// 비교
			if(highC.C <= curC.C) { // 더 높은 기둥을 만나거나 || 같은 크기의 기둥을 만남
				sum += (curC.x - highC.x) * highC.C;
				highC = curC; // 최고 놓이 기둥 갱신
				pivot = i;
				
			}
		}
		
		// 2. 오른쪽 부분 계산 : [pivot, N-1]
		highC = list.get(list.size() - 1); // 맨오른쪽 끝 기둥 (순서는 0부터 시작이라 size-1을 해야 끝기둥이 맞음)
		for(int i=1; i<list.size() - pivot; i++ ) {
			Info curC = list.get(list.size()-1 -i);
			
			if(highC.C <= curC.C) {
				sum += (highC.x - curC.x) * highC.C;
				highC = curC;
			}
		}
		
		// 3. pivot 기둥 넓이 더하기 (마지막)
		sum += list.get(pivot).C;
		
		System.out.println(sum);

	}
	
}

class Info {
	
	int x, C; // x 좌표, 높이 
	
	public Info(int x, int C) {
		this.x = x;
		this.C = C;
	}
	
}