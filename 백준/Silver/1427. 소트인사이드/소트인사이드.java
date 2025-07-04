import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 소트인사이드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		
		String[] str = br.readLine().split("");
		
		Integer[] arr = new Integer[str.length];
		
		for(int i=0; i<str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		
		for(int j=0; j<arr.length; j++) {
			sb.append(arr[j]);
		}
		
		System.out.println(sb);
		

	}

}
