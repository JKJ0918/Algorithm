import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer>[] graph; // 그래프 (인접 리스트)
	static boolean[] visited; // 방문체크
	static StringBuilder sb = new StringBuilder();
	
	static void dfs(int x) {
		visited[x] = true; // x 방문 표시
		sb.append(x).append(" "); // 방문 순서 기록
		
		// x와 연결된 정점들을 차례로 방문
		for(int i = 0; i<graph[x].size(); i++) {
			int next = graph[x].get(i); // i 번째 이웃 노드 꺼내기
			
			if(!visited[next]) {
				dfs(next);
			}
		}
	}
	
	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		visited[start] = true;
		q.add(start);
		
		while(!q.isEmpty()) {
			int x = q.poll();
			sb.append(x).append(" ");
			
			for(int i=0; i<graph[x].size(); i++) {
				int next = graph[x].get(i);
				
				if(!visited[next]) {
					visited[next] = true;
					q.add(next);
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// 백준_1260 DFS와 BFS
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 정점 개수
		int M = Integer.parseInt(st.nextToken()); // 간선 개수
		int V = Integer.parseInt(st.nextToken()); // 시작 정점
		
		// 그래프 배열 생성
		graph = new ArrayList[N + 1];
		for(int i=1; i<=N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		// 간선 입력 (무방향이므로 양쪽에 추가)
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		
			graph[a].add(b);
			graph[b].add(a);
			
		}
		
		// 번호 작은 것부터 방문하기 위해 정렬
		for(int i=1; i<=N; i++) {
			Collections.sort(graph[i]); // 오름차순
		}
		
		// DFS
		visited = new boolean[N+1];
		dfs(V);
		sb.append("\n");
		
		//BFS (방문 배열 다시 초기화)
		Arrays.fill(visited, false);
		bfs(V);
		
		System.out.println(sb.toString());
		
		
		
	}

}
