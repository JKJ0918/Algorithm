import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1620 - 나는야 포켓몬 마스터
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
        int N = Integer.parseInt(st.nextToken()); // 포켓몬 수
        int M = Integer.parseInt(st.nextToken()); // 질문 수
        
        String[] numToName = new String[N + 1];      // 번호 -> 이름
        HashMap<String, Integer> nameToNum = new HashMap<>(); // 이름 -> 번호
        
        // 도감 채우기
        for(int i=1; i<=N; i++) {
        	String name = br.readLine();
        	numToName[i] = name;
        	nameToNum.put(name, i);
        }
        
        // 질문 처리
        for(int j=0; j<M; j++) {
        	String q = br.readLine();
        	
        	// 첫 글자 구별
        	if(Character.isDigit(q.charAt(0))) { // 첫 글짜가 숫자일 경우
        		int idx = Integer.parseInt(q);
        		sb.append(numToName[idx]).append('\n');
        	} else {
        		sb.append(nameToNum.get(q)).append('\n');
        	}
        	
        } // end for
		
        
        System.out.println(sb.toString());
        
	}
	

}
