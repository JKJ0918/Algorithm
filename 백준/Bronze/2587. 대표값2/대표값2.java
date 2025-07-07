import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// 대표값 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int total = 0;
		
		for(int i=0; i<5; i++) {
			total += arr[i];
		}
		
		System.out.println(total/5);
		System.out.println(arr[2]);
	}

}
