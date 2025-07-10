import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 듣보잡
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<n; i++) { // 듣지도 못한 사람 입력
			set.add(br.readLine());
		}
		

		ArrayList<String> result = new ArrayList<String>();
		for(int i=0; i<m; i++) {
			// 본적도없는 사람입력
			String name = br.readLine();
			if(set.contains(name)) {
				result.add(name);
			}
		}
		
		// 사전순 정렬
		Collections.sort(result);
		
		System.out.println(result.size()); // 인원수
		for(String name : result) {
			System.out.println(name);
		}
		
	}

}
