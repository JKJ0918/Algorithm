import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 회사에 있는 사람
		// 로그가 주어졌을 때, 현재 회사에 있는 모든 사람을 구하는 프로그램을 작성하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine()); // 출입 기록의 수
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken(); // 이름
			String status = st.nextToken(); // 상태
			if(status.equals("enter")) { // enter
				set.add(name);
			}
			else { // leave
				set.remove(name);
			}
			
		}
		
		// HashSet -> List로 변환 후 내림차순 정렬
		List<String> list = new ArrayList<>(set);
		Collections.sort(list, Collections.reverseOrder());

		for (String name : list) { // 출력
			System.out.println(name);
		}
		
	}// end main

}
