import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int[] ary = new int[9]; // 서로다른 9개의 자연수가 주어짐
		
		
		for(int i=0; i<ary.length; i++) { // 배열 입력
			
			int a = Integer.parseInt(br.readLine());
			ary[i] = a;
		}
		
		int max = ary[0];
		int num = 1;
		
		for(int j=1; j<ary.length; j++) {
			
			if(ary[j]>max) {
				max = ary[j];
				num = j+1;
			}
			
		}
		
		System.out.println(max);
		System.out.println(num);
		

	}// end main

}
