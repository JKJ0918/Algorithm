import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 수학은 체육과목 입니다.
		// 가장 아랫부분의 정사각형 개수가 주어지면 그에 해당하는 답을 출력하는 프로그램을 만드세요.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Integer.parseInt(br.readLine()); // 가장 아래 정사각형 수 입력
		// 범위 확인
		System.out.println(4*a);
		
		
	}// end main

}
