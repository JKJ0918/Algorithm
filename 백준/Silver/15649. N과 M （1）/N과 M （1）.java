import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] arr;
	static boolean[] visited;
	
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		// N과 M (1)
		// 백트레킹 : 해를 찾는 도중 해가 아니면, 다시 되돌아가서 해를 찾는 기법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 
		int M = Integer.parseInt(st.nextToken()); // depth
		
		arr = new int[M];
		visited = new boolean[N];
		backtracking(N, M, 0);
		
		System.out.println(sb);
		

	}// end main

	
	static void backtracking(int N, int M, int depth) {
		if(depth == M) {
			for(int i=0; i<M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}//end if
		
		for(int i=0; i<N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				backtracking(N, M, depth+1);
				visited[i] = false;
			}
		}
		
	}//end for
	
}
