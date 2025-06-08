import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 관찰 횟수
        
        int[][] arr = new int[11][1]; // 소의 번호, 위치를 담을 배열
        
        for(int i=0; i<11; i++){ // 변수 초기화 소의 번호 -1(미지정소)
           arr[i][0] = -1; 
        }
        
        int total = 0; // 총 이동
        
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); // num 과 loc를 입력 받음
            
            int num = Integer.parseInt(st.nextToken());
            int loc = Integer.parseInt(st.nextToken());
            
            if(arr[num][0] == -1) {
                arr[num][0] = loc;
            }
            else if(arr[num][0] != loc){
                total++;
                arr[num][0] = loc; // 다시 원래 값 설정 (반복 위해)
            }
            
            
        }
            System.out.println(total);
    }
}
