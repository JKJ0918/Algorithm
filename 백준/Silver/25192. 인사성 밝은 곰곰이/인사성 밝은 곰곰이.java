import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		// 인사성 밝은 곰곰이

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 채팅 기록 수 
		
		HashSet<String> set = new HashSet<>(); // 해시맵 생성
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			
			String name = br.readLine(); // 입력
			
			if(name.equals("ENTER")) {
				set.clear();
			} else {
				if(!set.contains(name)) {
					set.add(name);
					count++;
				}
			}
			
		}
		
		System.out.println(count);
		
	}// end main

}
