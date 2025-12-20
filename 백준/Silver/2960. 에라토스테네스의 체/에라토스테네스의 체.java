import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 2960 에라토스테네스의 체
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        boolean[] removed = new boolean[N+1];
        int count = 0;
        
        for(int p=2; p <= N; p++) {
        	// 이미 지워진 수면 P가 될 수 없음(다음으로)
        	if(removed[p]) { // *바깥 for문 , ex, 2 를 하고 4를 하면 2일 때 지워져서 4는 스킵
        		continue;
        	}
        	
        	// p의 배수들을 작은 것부터 지움 (p도 포함)
        	for(int m = p; m <= N; m += p) {
        		
            	if(removed[m]) {
            		continue;
            	}
            	
                removed[m] = true;
                count++;
            	
                if (count == K) {
                    System.out.println(m);
                    return; // 프로그램 종료
                }
        	}
        }
	}
}
