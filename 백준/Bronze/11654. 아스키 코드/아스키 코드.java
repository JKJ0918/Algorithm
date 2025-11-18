import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 백준 11654 - 아스키 코드
		
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		System.out.println((int) c); // // char → int 형 변환해서 출력
		
		sc.close();
	}
	
}
