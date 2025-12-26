import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer>[] graph; // 인접 리스트
	static boolean[] visited;			// 방문 체크 배열
	static int N, M;
	
	// DFS (깊이 우선 탐색)
	static void dfs(int x) {
		visited[x] = true; // x 방문처리
		
		// x와 연결된 모든 정점들 탐색
		for(int i=0; i<graph[x].size(); i++) {
			int next = graph[x].get(i);
			
			if(!visited[next]) {
				dfs(next);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// 백준 11724_연결 요소 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); // 정점 수
		M = Integer.parseInt(st.nextToken()); // 간선 수
		
		// 인접 리스트 배열 생성
		graph = new ArrayList[N+1];
		for(int i=1; i<=N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		// 간선 입력 받기(무방향으로 양쪽 추가)
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}
		
		visited = new boolean[N+1];
		
		int count = 0; // 연결 요소 갯수
		
		// 1번 정점부터 N번 정점까지 확인
		for(int i=1; i<=N; i++) {
			if(!visited[i]) { // 방문하지 않았다 = 새로운 지점 발견
				dfs(i); // 그 지점의 모든 정점 방문 처리
				count++; // 연결요소 개수 +1
				
			}
		}
		
		System.out.println(count);
	}

}
