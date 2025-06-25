import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Queue<String> qu = new LinkedList<String>(); // 초기 문자열 받을 Queue
		Stack<String> stk = new Stack<String>(); // 필터링 스택
		
		StringBuilder sb = new StringBuilder(); // 출력에 사용

		String in = br.readLine();
		
		int a = 0; // <, > 감지
		
		for(String s : in.split("")) { // Queue에 문자열 입력
			qu.add(s);
		}
		
		while(!qu.isEmpty()) {
			
			if(qu.peek().equals("<")) { // '<' 처리
				if(!stk.isEmpty()) {
					while(!stk.isEmpty()) {
						sb.append(stk.pop());
					}
				}
				a++;
				sb.append(qu.poll());
			}else if(qu.peek().equals(">")) { // '>' 처리
				a--;
				sb.append(qu.poll()); 
			}else if(a==1) { // "<" 사이값 입력 ">"
				sb.append(qu.poll());
			}else if(a==0 && qu.peek().equals(" ")) { // 띄어쓰기 처리
				while(!stk.isEmpty()) {
					sb.append(stk.pop());
				}
				sb.append(qu.poll());

			}else if(a==0 && !qu.peek().equals(" ")){
				stk.push(qu.poll());
			}else {
				while(!stk.isEmpty()) {
					sb.append(stk.pop());
				}
			}
			

		}
		if(!stk.isEmpty()) {
			while(!stk.isEmpty()) {
				sb.append(stk.pop());
			}
		}

		
		System.out.println(sb);



	}

}
