import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;


public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<String> st1 = new Stack<>();

		Stack<String> st2 = new Stack<>();
		
	
		String str = br.readLine(); // 문자 입력 받음
		
		// 입력 받은 문자 스택 쌓기
		for(String s : str.split("")) {
			st1.push(s);
		}
		
		int n = Integer.parseInt(br.readLine()); //명령어 실행 갯수;
		
		for(int i=0; i<n; i++) {
			
			String cmd = br.readLine();// 명령어 입력
			
			if(cmd.equals("L")) { // 커서 왼쪽 한칸 이동
				
				if(!st1.isEmpty()) {
					st2.push(st1.pop()); // st1 반환값을 st2에 넣는다.
				}
				
			}else if(cmd.equals("D")) { // 커서 오른쪽 한칸 이동
				
				if(!st2.isEmpty()) {
					st1.push(st2.pop()); // st2 반환 값을 st1 에 넣음 
				}
				
			}else if(cmd.equals("B")) { // 커서 왼쪽 문자 삭제
				if(!st1.isEmpty()) {
					st1.pop();
				}
				
			}else if(cmd.startsWith("P")) { // 커서 왼쪽 문자 추가
				char x = cmd.charAt(2); // P x 에서 x만 추출 해서 입력
				st1.push(Character.toString(x));
			}

				
		}
		
		while(!st2.isEmpty()) {
			st1.push(st2.pop());
		}
		
		while(!st1.isEmpty()) {
			sb.append(st1.pop());
		}
		

		System.out.println(sb.reverse());
		
	}

}

