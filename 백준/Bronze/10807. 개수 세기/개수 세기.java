import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()); // 배열 크기

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int b = Integer.parseInt(br.readLine()); // 찾을 정수
		
		int count = 0; 
		
		// 길이가 a 인 배열 생성
		int[] intArray = new int[a];
		
		for(int i=0; i<a; i++) { // 배열 생성
			intArray[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int j=0; j<a; j++) {
			if(intArray[j] == b) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
		
		
	}// end for 

}
