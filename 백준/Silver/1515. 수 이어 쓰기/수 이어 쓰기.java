import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// 1515_수 이어 쓰기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int key = 0; // 현재 위치
		int value = 0; // 현재 비교중인 값
		
		while(value++ <= 35000) {
			
			String tmp = String.valueOf(value);
			
			for(int i=0; i<tmp.length(); i++) {
				if(tmp.charAt(i) == input.charAt(key)) {
					key++;
				}
				if(key == input.length()) {
					System.out.println(value);
					return;
				}
			}
			
		}
        
        		
	}

}
		