import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 2910 빈도 정렬
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력값 받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 메시지의 길이 n
		int c = Integer.parseInt(st.nextToken()); // 수의 범위 c
		List<Integer> list = new ArrayList<Integer>(); // 입력 수열을 저장할 리스트
		
		st = new StringTokenizer(br.readLine());
		
		// 각 숫자의 빈도수를 저장하는 해시맵
		Map<Integer, Integer> map = new HashMap<>();
		
		// 입력 수열을 리스트에 저장하고 빈도수를 해시맵에 기록
		List<Integer> original = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
			original.add(list.get(i));
			map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
		}
		
		// 빈도수를 기준으로 리스트 정렬
		Collections.sort(list, (o1, o2) -> {
			
			// 빈도수가 같을 경우, 원래 입력 순서 유지
			if(map.get(o1) == map.get(o2)) {
				return original.indexOf(o1) - original.indexOf(o2);
			} else { // 빈도수가 다른 경우, 빈도수를 기준으로 내림차순 정렬
				return Integer.compare(map.get(o2), map.get(o1));
			}
		});
		
		// 정렬된 리스트 출력
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) {
			sb.append(list.get(i) + " ");
		}
		System.out.println(sb);

	}

}
