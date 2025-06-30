import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()); // 정수 수
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 배열에 들어갈 수 입력
		
		int[] intArray = new int[a]; // 크기가 a 인 정수 배열 생성
		
		
		for(int i=0; i<a; i++) { // 배열 생성
			intArray[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = intArray[0]; // 최대값 초기화
		for(int k=1; k<a; k++) { // 최대값
			
			if(intArray[k]>max) {
				max = intArray[k];
			}
			
		}
		
		int min = intArray[0]; // 최소값 초기화
		for(int j=1; j<a; j++) { // 최소값
			
			if(intArray[j]<min) {
				min = intArray[j];
			}
			
		}
		
		
		System.out.println(min+" "+ max);
	}

}
