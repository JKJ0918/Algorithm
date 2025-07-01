import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// 킹, 퀸, 룩, 비숍, 나이트, 폰
	
	public static void main(String[] args) throws IOException {
		// 킹, 퀸, 룩, 비숍, 나이트, 폰
		// 1  1   2   2    2    8
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] input = new int[6]; // 배열 생성
		
		int[] output = new int[6]; // 출력 배열
		
		for(int i=0; i<input.length; i++) { // 
			
			input[i] = Integer.parseInt(st.nextToken());
		}

		
		for(int j=0; j<input.length; j++) {
			
			if(j<2) {
				output[j] = 1 - input[j]; 
			}else if (j<5) {
				output[j] = 2 - input[j];
			}else {
				output[j] = 8 - input[j];
			}
			
			System.out.print(output[j]+" ");
		}
		
		

	}

}
